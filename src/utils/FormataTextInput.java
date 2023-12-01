package utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class FormataTextInput extends PlainDocument {
   public enum TipoEntrada {
      NUMEROINTEIRO, NUMERODECIMAL, NOME, EMAIL, DATA, HORA, CPF, RG, CELULAR, TELEFONE;
   }

   private int         qtdCaracteres;
   private TipoEntrada tpEntrada;

   public FormataTextInput( int qtdCaracteres, TipoEntrada tpEntrada ) {
      this.qtdCaracteres = qtdCaracteres;
      this.tpEntrada = tpEntrada;
   }


   @Override
   public void insertString( int i, String string, AttributeSet as ) throws BadLocationException {
      if( string == null || getLength() == qtdCaracteres ){
         return;
      }
      int totalCarac = getLength() + string.length();
      // filtro de caracteres
      String regex = "";
      switch( tpEntrada ) {
         case NUMEROINTEIRO :
            regex = "[^0-9]";
            break;
         case NUMERODECIMAL :
            regex = "[^0-9,.]";
            break;
         case NOME :
            regex = "[^\\p{IsLatin} ]";
            break;
         case EMAIL :
            regex = "[^\\p{IsLatin}@.\\-_][^0-9]";
            break;
         case HORA :
            regex = "[^0-9:]";
            break;
         case CPF :
            regex = "[^0-9.\\-]";
            break;
         case RG :
            regex = "[^0-9.\\-]";
            break;
         case CELULAR :
            regex = "[^0-9\\-\\(\\)]";
            break;
         case TELEFONE :
            regex = "[^0-9\\-\\(\\)]";
            break;
         case DATA :
            regex = "[^0-9]";
            break;
      }

      string = string.replaceAll( regex, "" );

      if( tpEntrada == TipoEntrada.DATA && totalCarac <= qtdCaracteres ){
         if( totalCarac == 2 || totalCarac == 5 ){
            string += "/";
         }
         super.insertString( i, string, as );
      }

      else if( tpEntrada == TipoEntrada.HORA && totalCarac <= qtdCaracteres ){
         if( totalCarac == 2 ){
            string += ":";
         }
         super.insertString( i, string, as );
      }

      else if( tpEntrada == TipoEntrada.CPF ){
         if( totalCarac == 3 || totalCarac == 7 ){
            string += ".";
         }
         else if( totalCarac == 11 ){
            string += "-";
         }
         super.insertString( i, string, as );
      }

      else if( tpEntrada == TipoEntrada.RG ){
         if( totalCarac == 2 || totalCarac == 6 ){
            string += ".";
         }
         else if( totalCarac == 10 ){
            string += "-";
         }
         super.insertString( i, string, as );
      }

      else if( tpEntrada == TipoEntrada.CELULAR ){
         if( totalCarac == 1 ){
            string = "(" + string;
         }
         else if( totalCarac == 3 ){
            string += ")";
         }
         else if( totalCarac == 9 ){
            string += "-";
         }
         super.insertString( i, string, as );
      }

      else if( tpEntrada == TipoEntrada.TELEFONE ){
         if( totalCarac == 1 ){
            string = "(" + string;
         }
         else if( totalCarac == 3 ){
            string += ")";
         }
         else if( totalCarac == 8 ){
            string += "-";
         }
         super.insertString( i, string, as );
      }

      else if( totalCarac <= qtdCaracteres ){
         super.insertString( i, string, as );
      }
      else{
         String nova = string.substring( 0, qtdCaracteres );
         super.insertString( i, nova, as );
      }
   }
}
