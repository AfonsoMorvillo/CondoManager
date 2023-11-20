package model;

import java.sql.SQLException;
import java.util.ArrayList;

import controller.DataAccessObject;

public class Acesso extends DataAccessObject {
   private int       idAcesso;
   private String    entrada;
   private String    saida;
   private Casa      casa;
   private Visitante visitante;

   public Acesso() {
      super( "Acesso" );
   }


   public int getIdAcesso() {
      return idAcesso;
   }


   public String getEntrada() {
      return entrada;
   }


   public String getSaida() {
      return saida;
   }


   public Casa getCasa() {
      return casa;
   }


   public Visitante getVisitante() {
      return visitante;
   }


   public void setIdAcesso( int idAcesso ) {
      if( idAcesso != this.idAcesso ){
         this.idAcesso = idAcesso;
      }
   }


   public void setEntrada( String entrada ) {
      if( entrada != this.entrada ){
         this.entrada = entrada;
         addChange( "entrada", this.entrada );
      }
   }


   public void setSaida( String saida ) {
      if( saida != this.saida ){
         this.saida = saida;
         addChange( "saida", this.saida );
      }
   }


   public void setCasa( Casa casa ) throws SQLException, Exception {
      if( this.casa == null ){

         if( casa != null ){

            this.casa = new Casa();
            this.casa.setNumero( casa.getNumero() );
            this.casa.load();
            addChange( "casa", this.casa.getNumero() );
         }

      }
      else{

         if( casa == null ){

            this.casa = null;
            addChange( "casa", null );

         }
         else{

            if( !this.casa.equals( casa ) ){

               this.casa.setNumero( casa.getNumero() );
               this.casa.load();
               addChange( "casa", this.casa.getNumero() );

            }

         }
      }
   }


   public void setVisitante( Visitante visitante ) throws SQLException, Exception {

      if( this.visitante == null ){

         if( visitante != null ){

            this.visitante = new Visitante();
            this.visitante.setIdVisitante( visitante.getIdVisitante() );
            this.visitante.load();
            addChange( "visitante", this.visitante.getIdVisitante() );
         }
      }
      else{

         if( visitante == null ){

            this.visitante = null;
            addChange( "visitante", null );
         }
         else{

            if( !this.visitante.equals( visitante ) ){

               this.visitante.setIdVisitante( visitante.getIdVisitante() );
               this.casa.load();
               addChange( "visitante", this.visitante.getIdVisitante() );
            }
         }
      }
   }


   @Override
   protected String getWhereClauseForOneEntry() {
      return " idAcesso = " + this.idAcesso;
   }


   @Override
   protected void fill( ArrayList<Object> data ) throws Exception {
      this.idAcesso = (int)data.get( 0 );
      this.entrada = (String)data.get( 1 );
      this.saida = (String)data.get( 2 );
      if( data.get( 3 ) != null ){

         if( casa == null ){
            casa = new Casa();
         }
         casa.setNumero( (int)data.get( 3 ) );
         casa.load();
      }
      if( data.get( 4 ) != null ){

         if( visitante == null ){
            visitante = new Visitante();
         }
         visitante.setIdVisitante( (int)data.get( 4 ) );
         visitante.load();
      }
   }
}
