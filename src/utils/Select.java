package utils;

import java.util.ArrayList;
import java.util.List;

public class Select {
   private String       fromTable;
   private List<String> fields;
   private List<String> joinClauses;
   private List<String> whereClauses;

   public Select() {
      fields = new ArrayList<>();
      joinClauses = new ArrayList<>();
      whereClauses = new ArrayList<String>();
   }


   public Select( String from ) {
      fields = new ArrayList<>();
      joinClauses = new ArrayList<>();
      whereClauses = new ArrayList<String>();
      fromTable = from;
   }


   public void add( String field ) {
      fields.add( field );
   }


   public void add( String field, String alias ) {
      fields.add( field + " AS " + alias );
   }


   public void addLeftJoin( String joinTable, String onCondition ) {
      String joinClause = "LEFT JOIN " + joinTable + " ON " + onCondition;
      joinClauses.add( joinClause );
   }


   public void addWhere( String condition ) {
      String whereClause;

      if( whereClauses.isEmpty() ){
         whereClause = "WHERE " + condition;
      }
      else{
         whereClause = " AND " + condition;

      }

      whereClauses.add( whereClause );
   }


   public String build() {
      if( fields.isEmpty() ){
         return "";
      }

      StringBuilder selectQuery = new StringBuilder( "SELECT " );
      selectQuery.append( String.join( ", ", fields ) );

      if( !StringUtils.isEmpty( fromTable ) ){
         selectQuery.append( " FROM " );
         selectQuery.append( fromTable );
      }

      if( !joinClauses.isEmpty() ){
         selectQuery.append( " " );
         selectQuery.append( String.join( " ", joinClauses ) );
      }

      if( !whereClauses.isEmpty() ){
         selectQuery.append( " " );
         selectQuery.append( String.join( " ", whereClauses) );
      }

      return selectQuery.toString();
   }
}
