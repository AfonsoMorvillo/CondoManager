package model;

import java.sql.SQLException;
import java.util.ArrayList;

import controller.DataAccessObject;
import utils.StringUtils;

public class Entrega extends DataAccessObject {

   private int    idEntrega;
   private String nomeEntregador;
   private String entrega;
   private String horario_entrega;
   private String retirada;
   private String horario_retirada;
   private String status;
   private String observacao;
   private Casa   casa;

   public Entrega() {
      super( "Entregas" );
   }


   public int getIdEntrega() {
      return idEntrega;
   }


   public String getNomeEntregador() {
      return nomeEntregador;
   }


   public String getEntrega() {
      return entrega;
   }


   public String getHorario_entrega() {
      return horario_entrega;
   }


   public String getRetirada() {
      return retirada;
   }


   public String getHorario_retirada() {
      return horario_retirada;
   }


   public String getStatus() {
      return status;
   }


   public String getObservacao() {
      return observacao;
   }


   public Casa getCasa() {
      return casa;
   }


   public void setIdEntrega( int idEntrega ) {

      if( idEntrega != this.idEntrega ){
         this.idEntrega = idEntrega;
      }
   }


   public void setNomeEntregador( String nomeEntregador ) {
      if( !nomeEntregador.equals( this.nomeEntregador ) ){
         this.nomeEntregador = nomeEntregador;
         addChange( "nomeEntregador", this.nomeEntregador );
      }
   }


   public void setEntrega( String entrega ) {
      if( !entrega.equals( this.entrega ) ){
         this.entrega = entrega;
         addChange( "entrega", this.entrega );
      }
   }


   public void setHorario_entrega( String horario_entrega ) {
      if( !horario_entrega.equals( this.horario_entrega ) ){
         this.horario_entrega = horario_entrega;
         addChange( "horario_entrega", this.horario_entrega );
      }
   }


   public void setRetirada( String retirada ) {
      if( !StringUtils.isEmpty( retirada ) && !retirada.equals( this.retirada ) ){
         this.retirada = retirada;
         addChange( "retirada", this.retirada );
      }
   }


   public void setHorario_retirada( String horario_retirada ) {
      if( !StringUtils.isEmpty( horario_retirada ) && !horario_retirada.equals( this.horario_retirada ) ){
         this.horario_retirada = horario_retirada;
         addChange( "horario_retirada", this.horario_retirada );
      }
   }


   public void setStatus( String status ) {
      if( !status.equals( this.status ) && !StringUtils.isEmpty( status )){
         this.status = status;
         addChange( "status", this.status );
      }
   }


   public void setObservacao( String observacao ) {
      if( !observacao.equals( this.observacao ) ){
         this.observacao = observacao;
         addChange( "observacao", this.observacao );
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


   @Override
   protected String getWhereClauseForOneEntry() {
      return " idEntrega = " + this.idEntrega;
   }


   @Override
   protected void fill( ArrayList<Object> data ) throws Exception {
      this.idEntrega = (int)data.get( 0 );
      this.nomeEntregador = (String)data.get( 1 );
      if( data.get( 2 ) != null ){
         this.entrega = (String)data.get( 2 ).toString();
      }
      if( data.get( 3 ) != null ){
         this.horario_entrega = (String)data.get( 3 ).toString();
      }
      
      if( data.get( 4 ) != null ){
         this.retirada = (String)data.get( 4 ).toString();
      }else {
    	  this.retirada = "";
      }
      
      
      
      if( data.get( 5 ) != null ){
         this.horario_retirada = (String)data.get( 5 ).toString();
      }else {
    	  this.horario_retirada = "";
      }

      this.status = (String)data.get( 6 );
      this.observacao = (String)data.get( 7 );
      if( data.get( 8 ) != null ){

         if( casa == null ){
            casa = new Casa();
         }

         casa.setNumero( (int)data.get( 8 ) );
         casa.load();
      }
   }
}
