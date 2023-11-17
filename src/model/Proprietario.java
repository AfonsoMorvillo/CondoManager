package model;

import java.util.ArrayList;

import controller.DataAccessObject;

public class Proprietario extends DataAccessObject {

   private int    idProprietario;
   private String nome;
   private String email;
   private String telefone;
   private String dataNascimento;
   private String dataAquisicao;
   private String cpf;
   private String rg;

   public Proprietario() {
      super( "Proprietario" );
   }


   public int getIdProprietario() {
      return idProprietario;
   }


   public void setIdProprietario( int idProprietario ) {

      if( idProprietario != this.idProprietario ){

         this.idProprietario = idProprietario;
      }
   }


   public String getNome() {
      return nome;
   }


   public void setNome( String nome ) {

      if( !nome.equals( this.nome ) ){

         this.nome = nome;
         addChange( "nome", this.nome );
      }
   }


   public String getEmail() {
      return email;
   }


   public void setEmail( String email ) {

      if( !email.equals( this.email ) ){

         this.email = email;
         addChange( "email", this.email );
      }
   }


   public String getTelefone() {
      return telefone;
   }


   public void setTelefone( String telefone ) {

      if( !telefone.equals( this.telefone ) ){

         this.telefone = telefone;
         addChange( "telefone", this.telefone );
      }
   }


   public String getDataNascimento() {
      return dataNascimento;
   }


   public void setDataNascimento( String dataNascimento ) {

      if( !dataNascimento.equals( this.dataNascimento ) ){

         this.dataNascimento = dataNascimento;
         addChange( "dataNascimento", this.dataNascimento );
      }
   }


   public String getdataAquisicao() {
      return dataAquisicao;
   }


   public void setDataAquisicao( String dataAquisicao ) {

      if( !dataAquisicao.equals( this.dataAquisicao ) ){

         this.dataAquisicao = dataAquisicao;
         addChange( "dataAquisicao", this.dataAquisicao );
      }
   }


   public String getCpf() {
      return cpf;
   }


   public void setCpf( String cpf ) {

      if( !cpf.equals( this.cpf ) ){

         this.cpf = cpf;
         addChange( "cpf", this.cpf );
      }
   }


   public String getRg() {
      return rg;
   }


   public void setRg( String rg ) {

      if( !rg.equals( this.rg ) ){

         this.rg = rg;
         addChange( "rg", this.rg );
      }
   }


   @Override
   protected String getWhereClauseForOneEntry() {
      return "idProprietario = " + this.idProprietario;
   }


   @Override
   protected void fill( ArrayList<Object> data ) {
      this.idProprietario = (int)data.get( 0 );
      this.nome = (String)data.get( 1 );
      this.email = (String)data.get( 2 );
      this.telefone = (String)data.get( 3 );
      if (data.get(4) != null){
          this.dataNascimento = (String) data.get(4).toString();
      }
       if (data.get(5) != null){
          this.dataAquisicao = (String) data.get(5).toString();
      }
      
      this.cpf = (String)data.get( 6 );
      this.rg = (String)data.get( 7 );
   }


   @Override
   public boolean equals( Object obj ) {

      if( obj instanceof Proprietario ){
         Proprietario aux = (Proprietario)obj;

         if( idProprietario == aux.getIdProprietario() ){
            return true;
         }
      }
      return false;
   }
}
