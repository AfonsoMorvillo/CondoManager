package model;

import java.util.ArrayList;

import controller.DataAccessObject;

public class Visitante extends DataAccessObject {

   private int    idVisitante;
   private String rg;
   private String nome;
   private int    idade;
   private String celular;

   public Visitante() {
      super( "Visitantes" );
   }


   public int getIdVisitante() {
      return idVisitante;
   }


   public String getRg() {
      return rg;
   }


   public String getNome() {
      return nome;
   }


   public int getIdade() {
      return idade;
   }


   public String getCelular() {
      return celular;
   }


   public void setIdVisitante( int idVisitante ) {

      if( idVisitante != this.idVisitante ){
         this.idVisitante = idVisitante;
      }
   }


   public void setRg( String rg ) {
      if( !rg.equals( this.rg ) ){
         this.rg = rg;
         addChange( "rg", this.rg );
      }
   }


   public void setNome( String nome ) {
      if( !nome.equals( this.nome ) ){
         this.nome = nome;
         addChange( "nome", this.nome );
      }
   }


   public void setIdade( int idade ) {
      if( idade != this.idade ){
         this.idade = idade;
         addChange( "idade", this.idade );
      }
   }


   public void setCelular( String celular ) {
      if( !celular.equals( this.celular ) ){
         this.celular = celular;
         addChange( "celular", this.celular );
      }
   }


   @Override
   protected String getWhereClauseForOneEntry() {
      return "idVisitante = " + this.idVisitante;
   }


   @Override
   protected void fill( ArrayList<Object> data ) throws Exception {
      this.idVisitante = (int)data.get( 0 );
      this.rg = (String)data.get( 1 );
      this.nome = (String)data.get( 2 );
      this.idade = (int)data.get( 3 );
      this.celular = (String)data.get( 4 );
   }


   @Override
   public boolean equals( Object obj ) {
      
      if( obj instanceof Visitante ){
         Visitante aux = (Visitante)obj;

         if( idVisitante == aux.getIdVisitante() ){
            return true;
         }
      }
      return false;
   }
}
