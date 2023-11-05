package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtils {

   /**
    * @param str
    *           = string a ser validada
    * @return true = apenas numeros na string
    */
   public static boolean isOnlyNumbers( String str ) {
      if( str == null || str.isEmpty() ){
         return false;
      }

      for( char c : str.toCharArray() ){
         if( !Character.isDigit( c ) ){
            return false;
         }
      }

      return true;
   }


   public static Date stringToDate( String dataNascimentoString ) {
      SimpleDateFormat sdf = new SimpleDateFormat( "dd/MM/yyyy" );
      Date dataNascimento;
      try{
         dataNascimento = sdf.parse( dataNascimentoString );
         return dataNascimento;
      }
      catch( ParseException e ){
         e.printStackTrace();
      }
      return null;
   }


   public static boolean stringToBooleanDataBase( String b ) {

      if( b == null ){
         return false;
      }

      return b.equals( "S" );
   }


   public static String booleanToStringDataBase( boolean string ) {

      return string ? "S" : "N";
   }


   public static String dataParaTela( String inputDate ) {
      try{
         // Define os formatos de entrada e saída
         SimpleDateFormat inputFormat = new SimpleDateFormat( "yyyy-MM-dd" );
         SimpleDateFormat outputFormat = new SimpleDateFormat( "dd/MM/yyyy" );

         // Converte a string de entrada em um objeto Date
         Date date = inputFormat.parse( inputDate );

         // Formata a data no formato desejado
         String outputDate = outputFormat.format( date );

         return outputDate;
      }
      catch( ParseException e ){
         // Lida com erros de parse, se houver algum
         e.printStackTrace();
         return null; // Ou retorne uma mensagem de erro, se preferir
      }
   }
   
   public static String dataParaBanco(String inputDate) {
      try {
          // Define os formatos de entrada e saída
          SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
          SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
          
          // Converte a string de entrada em um objeto Date
          Date date = inputFormat.parse(inputDate);
          
          // Formata a data no formato desejado
          String outputDate = outputFormat.format(date);
          
          return outputDate;
      } catch (ParseException e) {
          // Lida com erros de parse, se houver algum
          e.printStackTrace();
          return null; // Ou retorne uma mensagem de erro, se preferir
      }
  }
   
   public static boolean isEmpty(String str) {
      return str == null || str.isEmpty();
   }

}
