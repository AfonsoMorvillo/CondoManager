package utils;

import java.util.ArrayList;
import java.util.List;

public class Select {
   private List<String> fields;
   private String       fromTable;

   public Select() {
      fields = new ArrayList<>();
   }
   
   public Select(String from) {
      fields = new ArrayList<>();
      fromTable = from;
   }


   public void add( String field ) {
      fields.add( field );
   }


   public void add( String field, String alias ) {
      fields.add( field + " AS " + alias );
   }


   public String build() {
      if( fields.isEmpty() ){
         return "";
      }

      StringBuilder selectQuery = new StringBuilder( "SELECT " );
      selectQuery.append( String.join( ", ", fields ) );

      if( !StringUtils.isEmpty( fromTable )){
         selectQuery.append( " FROM " );
         selectQuery.append( fromTable );
      }

      return selectQuery.toString();
   }

}
