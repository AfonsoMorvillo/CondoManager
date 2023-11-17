package controller;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

            if( value != null ){

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
            else{
               values += "NULL";
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

            if( value != null ){

               if( value instanceof String ){
                  set += "'" + value + "'";
               }
               else if( value instanceof Date ){

                  SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );
                  String formattedDate = sdf.format( (Date)value );
                  set += "'" + formattedDate + "'";
               }
               else{
                  set += value;
               }

            }
            else{
               set += "NULL";
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


   public void load() throws SQLException, Exception {

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


   protected abstract void fill( ArrayList<Object> data ) throws Exception;


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

   // public <T> void fill(String query, T instance) {
   //
   // String sql;
   // sql = query + " FROM " + this.table + " WHERE " + getWhereClauseForOneEntry();
   //
   // try {
   // dbConnection.executeSelect(sql);
   // boolean status = dbConnection.getResultset().next();
   // if (status) {
   // HashMap<String, Object> data = new HashMap<>();
   //
   // for (int i = 1; i <= dbConnection.getMetaData().getColumnCount(); i++) {
   // if (dbConnection.getResultset().getObject(i) != null) {
   // data.put(dbConnection.getMetaData().getColumnLabel(i),
   // dbConnection.getResultset().getObject(i));
   // }
   // }
   //
   // preencheObjeto(data, instance);
   // }
   //
   // } catch (SQLException e) {
   // e.printStackTrace();
   // }
   // }
   //
   // private <T> void preencheObjeto(HashMap<String, Object> data, T instance) {
   //
   // try {
   // List<Field> declaredFields = Arrays.asList(instance.getClass().getDeclaredFields());
   //
   // for (String campo : data.keySet()) {
   // Field field = declaredFields.stream().filter(variavel -> variavel.getName().equals(campo)).findFirst().orElse(null);
   //
   // String setterName = "set" + campo.substring(0, 1).toUpperCase() + campo.substring(1); // método set
   //
   // Method setterMethod;
   //
   // if ( field != null ) {
   // setterMethod = instance.getClass().getMethod(setterName, field.getType());
   // }else {
   // setterMethod = instance.getClass().getMethod(setterName, int.class);
   // }
   //
   //
   // if (setterMethod != null) {
   // if (data.get(campo) instanceof Date) {
   // Date date = (Date) data.get(campo);
   // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
   // String formattedDate = dateFormat.format(date);
   // setterMethod.invoke(instance, formattedDate);
   // continue;
   // }
   // setterMethod.invoke(instance, data.get(campo));
   // }
   // }
   // Method clear = instance.getClass().getMethod("limpa", null);
   // clear.invoke(instance, null);
   // } catch (Exception e) {
   // e.printStackTrace();
   // }
   // }


   public void limpa() {
      this.novel = false;
      this.changed = false;
      dirty.clear();
   }

}
