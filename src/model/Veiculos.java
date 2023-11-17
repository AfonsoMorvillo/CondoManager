
package model;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import controller.DataAccessObject;

public class Veiculos extends DataAccessObject {
   private String placaCarro;
   private String modelo;
   private String marca;
   private String tipo;
   private String cor;
   private String ano;
   private Casa   casa;

   public Veiculos() {
      super( "Veículos" );
   }


   public String getPlacaCarro() {
      return placaCarro;
   }


   public String getModelo() {
      return modelo;
   }


   public String getMarca() {
      return marca;
   }


   public String getTipo() {
      return tipo;
   }


   public String getCor() {
      return cor;
   }


   public String getAno() {
      return ano;
   }


   public Casa getCasa() {
      return casa;
   }


   public void setPlacaCarro( String placaCarro ) {
      if( !placaCarro.equals( ( this.placaCarro ) ) ){
         this.placaCarro = placaCarro;
         addChange( "placaCarro", this.placaCarro );
      }
   }


   public void setModelo( String modelo ) {

      if( !modelo.equals( ( this.modelo ) ) ){
         this.modelo = modelo;
         addChange( "modelo", this.modelo );
      }
   }


   public void setMarca( String marca ) {
      if( !marca.equals( ( this.marca ) ) ){
         this.marca = marca;
         addChange( "marca", this.marca );
      }
   }


   public void setTipo( String tipo ) {
      if( !tipo.equals( ( this.tipo ) ) ){
         this.tipo = tipo;
         addChange( "tipo", this.tipo );
      }
   }


   public void setCor( String cor ) {
      if( !cor.equals( ( this.cor ) ) ){
         this.cor = cor;
         addChange( "cor", this.cor );
      }
   }


   public void setAno( String ano ) {

      if( !ano.equals( ( this.ano ) ) ){
         this.ano = ano;
         addChange( "ano", this.ano );
      }
   }


   public void setCasa( Casa casa ) throws Exception {

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
      return " placaCarro = '" + this.placaCarro + "'";

   }


   @Override
   protected void fill( ArrayList<Object> data ) throws Exception {
      this.placaCarro = (String)data.get( 0 );
      this.modelo = (String)data.get( 1 );
      this.marca = (String)data.get( 2 );
      this.tipo = (String)data.get( 3 );
      this.cor = (String)data.get( 4 );
      if (data.get(5) != null) {
         Date dataCompleta = (Date) data.get(5);

         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
         this.ano = dateFormat.format(dataCompleta);
     }

      if( data.get( 6 ) != null ){

         if( casa == null ){
            casa = new Casa();
         }

         casa.setNumero( (int)data.get( 6 ) );
         casa.load();
      }

   }

}
