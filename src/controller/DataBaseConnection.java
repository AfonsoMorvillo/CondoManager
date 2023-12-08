package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public final class DataBaseConnection {

   private Connection                connection = null;
   private Statement                 statement  = null;
   private ResultSet                 resultSet  = null;
   private ResultSetMetaData         metaData   = null;

   private static DataBaseConnection singleton  = new DataBaseConnection();

    private static final String url = "jdbc:mysql://localhost:3306/condomanager"; // CASA
//    private static final String url = "jdbc:mysql://127.0.0.1:3307/condoManager"; // IFSP
    private static final String user = "root";
    private static final String password = "root";

//    private static final String url = AppConfig.getUrl();
//    private static final String user = AppConfig.getUser();
//    private static final String password = AppConfig.getPassword();

   private DataBaseConnection() {
   }


   public static DataBaseConnection getInstance() {
      return singleton;
   }


   public Connection getConn() {
      return connection;
   }


   public Statement getStatement() {
      return statement;
   }


   public ResultSet getResultset() {
      return resultSet;
   }


   public ResultSetMetaData getMetaData() {
      return metaData;
   }


   public static DataBaseConnection getSingleton() {
      return singleton;
   }


   public void executeSelect( String query ) throws SQLException {

      if( statement == null ){
         createStatement();
      }
      
      System.out.println( "\n" + query + "\n" );
      
      resultSet = statement.executeQuery( query );
      metaData = resultSet.getMetaData();

   }


   public boolean execute( String sql ) throws SQLException {

      if( statement == null ){
         createStatement();
      }

      System.out.println( sql );
      return statement.execute( sql );
   }


   public void createStatement() throws SQLException {

      if( connection == null ){
         connect();
      }
      statement = connection.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
   }


   public void connect() throws SQLException {

      if( connection == null ){
         connection = DriverManager.getConnection( url, user, password );
      }
   }


   public void disconnectFromDatabase() throws SQLException {

      if( resultSet != null ){
         resultSet.close();

      }
      if( connection != null ){
         connection.close();

      }
      if( statement != null ){
         statement.close();

      }
      connection = null;
      statement = null;
      resultSet = null;
   }
}
