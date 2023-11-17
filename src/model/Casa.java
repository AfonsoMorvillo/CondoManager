
package model;

import java.util.ArrayList;

import controller.DataAccessObject;

public class Casa extends DataAccessObject {
   private int          numero;
   private String       bloco;
   private String       dataRegistro;
   private int          vagas;
   private Proprietario proprietario;

   public Casa() {
      super( "Casa" );
   }


   public int getNumero() {
      return numero;
   }


   public String getBloco() {
      return bloco;
   }


   public Proprietario getProprietario() {
      return proprietario;
   }


   public int getVagas() {
      return vagas;
   }


   public String getDataRegistro() {
      return dataRegistro;
   }


   public void setNumero( int numero ) {
      if( numero != this.numero ){
         this.numero = numero;
         addChange( "numero", this.numero );
      }
   }


   public void setBloco( String bloco ) {
      if( !bloco.equals( ( this.bloco ) ) ){
         this.bloco = bloco;
         addChange( "bloco", this.bloco );
      }
   }


   public void setVagas( int vagas ) {
      if( vagas != this.vagas ){
         this.vagas = vagas;
         addChange( "vagas", this.vagas );
      }
   }


   public void setDataRegistro( String dataRegistro ) {
      if( !dataRegistro.equals( ( this.dataRegistro ) ) ){
         this.dataRegistro = dataRegistro;
         addChange( "dataRegistro", this.dataRegistro );
      }
   }


   public void setProprietario( Proprietario proprietario ) throws Exception {

      if( this.proprietario == null ){

         if( proprietario != null ){

            this.proprietario = new Proprietario();
            this.proprietario.setIdProprietario( proprietario.getIdProprietario() );
            this.proprietario.load();
            addChange( "idProprietario", this.proprietario.getIdProprietario() );

         }

      }
      else{

         if( proprietario == null ){

            this.proprietario = null;
            addChange( "idProprietario", null );

         }
         else{

            if( !this.proprietario.equals( proprietario ) ){

               this.proprietario.setIdProprietario( proprietario.getIdProprietario() );
               this.proprietario.load();
               addChange( "idProprietario", this.proprietario.getIdProprietario() );

            }

         }
      }
   }


   @Override
   protected String getWhereClauseForOneEntry() {
      return " numero = " + this.numero;
   }


   @Override
   protected void fill( ArrayList<Object> data ) throws Exception {
      this.numero = (int)data.get( 0 );
      this.bloco = (String)data.get( 1 );
      if( data.get( 2 ) != null ){
         this.dataRegistro = (String)data.get( 2 ).toString();
      }
      this.vagas = (int)data.get( 3 );


      if( data.get( 4 ) != null ){

         if( proprietario == null ){
            proprietario = new Proprietario();
         }

         proprietario.setIdProprietario( (int)data.get( 4 ) );
         proprietario.load();
      }
   }


   @Override
   public boolean equals( Object obj ) {

      if( obj instanceof Casa ){
         Casa aux = (Casa)obj;

         if( numero == aux.getNumero() ){
            return true;
         }
      }
      return false;
   }

}
