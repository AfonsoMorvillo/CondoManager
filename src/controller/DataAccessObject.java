package controller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public abstract class DataAccessObject {

   private DataBaseConnection      dbConnection;

   private String                  table;
   private boolean                 novel;
   private boolean                 changed;

   private HashMap<String, Object> dirty;

   public DataAccessObject( String table ) {

      dbConnection = DataBaseConnection.getInstance();
      this.table = table;
      this.novel = true;
      this.changed = false;
      dirty = new HashMap<String, Object>();
   }


   public void insert() throws SQLException {

      if( this.novel && this.changed ){

         String sql;

         sql = "INSERT INTO " + this.table;

         String fields = "";
         String values = "";
         boolean first = true;

         for( String key : dirty.keySet() ){

            if( first ){
               first = false;
            }
            else{

               fields += ",";
               values += ",";
            }

            fields += key;
            Object value = dirty.get( key );

            if( value instanceof String ){
               values += "'" + value + "'";
            }
            
            else if( value instanceof Date ){

               SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );
               String formattedDate = sdf.format( (Date)value );
               values += "'" + formattedDate + "'";
            }
            
            else{
               values += value;
            }
         }

         sql += " (" + fields + ")";
         sql += " VALUES ";
         sql += " (" + values + ")";

         dbConnection.execute( sql );

         limpa();
      }

   }


   public void update() throws SQLException {

      if( !this.novel && this.changed ){
         String sql;
         sql = "UPDATE " + this.table + " SET ";

         String set = "";
         boolean first = true;
         
         for( String key : dirty.keySet() ){

            if( first ){
               first = false;
            }
            else{
               set += ",";
            }

            set += key + "=";
            Object value = dirty.get( key );

            if( value instanceof String ){
               set += "'" + value + "'";
            }
            else{
               set += value;
            }

         }
         sql += set;
         sql += " WHERE ";
         sql += getWhereClauseForOneEntry();

         dbConnection.execute( sql );

         this.changed = false;
         dirty.clear();
      }
   }


   public void delete() throws SQLException {
      String sql;

      sql = "DELETE FROM " + this.table;
      sql += " WHERE ";
      sql += getWhereClauseForOneEntry();
      dbConnection.execute( sql );
   }


   public void load() throws SQLException {

      String sql;

      sql = "SELECT * FROM " + this.table + " WHERE " + getWhereClauseForOneEntry();
      dbConnection.executeSelect( sql );

      boolean status = dbConnection.getResultset().next();

      if( status ){
         ArrayList<Object> data = new ArrayList<Object>();

         for( int i = 1; i <= dbConnection.getMetaData().getColumnCount(); i++ ){
            data.add( dbConnection.getResultset().getObject( i ) );
         }

         fill( data );
         limpa();
      }

   }


   public void save() throws SQLException {

      if( this.novel && this.changed ){
         insert();
      }

      if( !this.novel && this.changed ){
         update();
      }
   }


   public void disconnectFromDatabase() throws SQLException {
      dbConnection.disconnectFromDatabase();
   }


   protected List<List<Object>> getAll( String order ) throws SQLException {

      List<List<Object>> all = new ArrayList<>();

      String query = "SELECT * FROM " + this.table + " ORDER BY " + order;

      dbConnection.executeSelect( query );

      while( dbConnection.getResultset().next() ){

         ArrayList<Object> data = new ArrayList<Object>();

         for( int i = 1; i <= dbConnection.getMetaData().getColumnCount(); i++ ){
            data.add( dbConnection.getResultset().getObject( i ) );
         }

         all.add( data );
      }

      return all;
   }


   protected abstract String getWhereClauseForOneEntry();


   protected abstract void fill( ArrayList<Object> data );


   /**
    * @param campoTabela
    *           = Campo da tabela que a varaivel se refere
    * @param valor
    *           = Valor que foi alterado/adicionado
    */
   protected void addChange( String campoTabela, Object valor ) {
      dirty.put( campoTabela, valor );
      this.changed = true;
   }


   public <T> T teste( String query, Class<T> clazz ) {

      String sql;
      sql = query + " FROM " + this.table + " WHERE " + getWhereClauseForOneEntry();
      System.out.println( sql );
      
      try{
         dbConnection.executeSelect( sql );
         boolean status = dbConnection.getResultset().next();
         if( status ){
            HashMap<String, Object> data = new HashMap<>();

            for( int i = 1; i <= dbConnection.getMetaData().getColumnCount(); i++ ){
               if( dbConnection.getResultset().getObject( i ) != null ){
                  data.put( dbConnection.getMetaData().getColumnLabel( i ), dbConnection.getResultset().getObject( i ) );
               }
            }

            T instance = preencheObjeto( data, clazz );
            return instance;
         }

      }
      catch( SQLException e ){
         e.printStackTrace();
      }

      return null;

   }


   public <T> T preencheObjeto( HashMap<String, Object> data, Class<T> clazz ) {

      try{
         T instance = clazz.newInstance();
         List<Field> declaredFields = Arrays.asList( clazz.getDeclaredFields() );

         for( String campo : data.keySet() ){
            Field field = declaredFields.stream().filter( variavel -> variavel.getName().equals( campo ) ).findFirst().orElse( null );

            if( field != null ){
               String fieldName = field.getName(); // nome do atributo
               String setterName = "set" + fieldName.substring( 0, 1 ).toUpperCase() + fieldName.substring( 1 ); // método set

               Method setterMethod = clazz.getMethod( setterName, field.getType() );
               if( setterMethod != null ){
                  if( data.get( campo ) instanceof Date ){
                     Date date = (Date)data.get( campo );
                     SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" ); // Defina o formato desejado
                     String formattedDate = dateFormat.format( date );
                     setterMethod.invoke( instance, formattedDate );
                     continue;
                  }
                  setterMethod.invoke( instance, data.get( campo ) ); 
               }
            }
         }
         Method clear = clazz.getMethod( "limpa", null );
         clear.invoke( instance, null );
         return instance;
      }
      catch( Exception e ){
      }
      return null;
   }


   public void limpa() {
      this.novel = false;
      this.changed = false;
      dirty.clear();
   }

}
