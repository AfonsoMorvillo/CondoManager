package model;

import controller.DataAccessObject;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;

public class Usuario extends DataAccessObject {

   private int    idUsuario;
   private String username;
   private String senha;

   public Usuario() {
      super( "usuario" );
   }


   public int getIdUsuario() {
      return idUsuario;
   }


   public String getUsername() {
      return username;
   }


   public String getSenha() {
      return senha;
   }


   public void setIdUsuario( int idUsuario ) {
      if( idUsuario != this.idUsuario ){
         this.idUsuario = idUsuario;
         addChange( "idUsuario", this.idUsuario );
      }
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

      idUsuario = (int)data.get( 0 );
      username = (String)data.get( 1 );
      senha = (String)data.get( 2 );

   }


   @Override
   public boolean equals( Object obj ) {
      if( obj instanceof Usuario ){

         Usuario aux;
         aux = (Usuario)obj;

         if( idUsuario == aux.getIdUsuario() ){
            return true;
         }
      }
      return false;
   }

}