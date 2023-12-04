package model;

import controller.DataAccessObject;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;

public class Usuario extends DataAccessObject {

   private String username;
   private String senha;

   public Usuario() {
      super( "usuario" );
   }




   public String getUsername() {
      return username;
   }


   public String getSenha() {
      return senha;
   }




   public void setUsername( String username ) {
      if( !username.equals( this.username ) ){
         this.username = username;
         addChange( "username", this.username );
      }
   }


   public void setSenha( String senha ) {
      if( !senha.equals( this.senha ) ){
         this.senha = getSenhaHash( senha );
         addChange( "senha", this.senha );
      }
   }


   private String getSenhaHash( String senha ) {
      String senhaHash = "";
      try{
         MessageDigest md = MessageDigest.getInstance( "SHA-256" );
         senha +=  getUsername() ; // Técnica de Proteção de Morris-Thompson (Sal n-bits)
         senhaHash = new BigInteger( 1, md.digest( senha.getBytes( "UTF-8" ) ) ).toString( 16 );
      }
      catch( Exception ex ){
         ex.printStackTrace();
      }
      return senhaHash;
   }


   @Override
   protected String getWhereClauseForOneEntry() {
      return " username = '" + username + "'";
   }


   @Override
   protected void fill( ArrayList<Object> data ) throws Exception {

      username = (String)data.get( 0 );
      senha = (String)data.get( 1 );

   }


   @Override
   public boolean equals( Object obj ) {
      if( obj instanceof Usuario ){

         Usuario aux;
         aux = (Usuario)obj;

         if( username == aux.getUsername() ){
            return true;
         }
      }
      return false;
   }

}