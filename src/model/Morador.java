package model;

import java.util.ArrayList;

import controller.DataAccessObject;
import utils.StringUtils;

public class Morador extends DataAccessObject {

   private int    codigo;
   private String nome;
   private String dataNascimento;
   private String rg;
   private String cpf;
   private String email;
   private String celular;
   private String telefone;
   private String inicioMoradia;
   private Casa   casa;

   public Morador() {
      super( "Morador" );
   }


   public int getCodigo() {
      return codigo;
   }


   public void setCodigo( int codigo ) {
      if( codigo != this.codigo ){
         this.codigo = codigo;
         addChange( "codigo", this.codigo );
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


   public String getDataNascimento() {
      return dataNascimento;
   }


   public void setDataNascimento( String dataNascimento ) {
      if( !StringUtils.isEmpty(dataNascimento) && !dataNascimento.equals( this.dataNascimento ) ){
         this.dataNascimento = dataNascimento;
         addChange( "dataNascimento", this.dataNascimento );
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


   public String getCpf() {
      return cpf;
   }


   public void setCpf( String cpf ) {
      if( !cpf.equals( this.cpf ) ){
         this.cpf = cpf;
         addChange( "cpf", this.cpf );
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


   public String getCelular() {
      return celular;
   }


   public void setCelular( String celular ) {
      if( !celular.equals( this.celular ) ){
         this.celular = celular;
         addChange( "celular", this.celular );
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


   public String getInicioMoradia() {
      return inicioMoradia;
   }


   public void setInicioMoradia( String inicioMoradia ) {
      if(!StringUtils.isEmpty(inicioMoradia) &&  !inicioMoradia.equals( this.inicioMoradia ) ){
         this.inicioMoradia = inicioMoradia;
         addChange( "inicioMoradia", this.inicioMoradia );
      }
   }


   public Casa getCasa() {
      return casa;
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
   protected void fill( ArrayList<Object> data ) throws Exception {
      this.codigo = (int)data.get( 0 );
      this.nome = (String)data.get( 1 );
      
      if( data.get( 2 ) != null ){
         this.dataNascimento = (String)data.get( 2 ).toString();
      }

      this.rg = (String)data.get( 3 );
      this.cpf = (String)data.get( 4 );
      // this.imagem = (String) data.get(5);
      this.email = (String)data.get( 6 );
      this.celular = (String)data.get( 7 );
      this.telefone = (String)data.get( 8 );
      
      if( data.get(  9 ) != null ){
         this.inicioMoradia = (String)data.get(  9 ).toString();
      }

      if( data.get( 10 ) != null ){

         if( casa == null ){
            casa = new Casa();
         }

         casa.setNumero( (int)data.get( 10 ) );
         casa.load();
      }
   }


   @Override
   protected String getWhereClauseForOneEntry() {
      return "codigo = " + this.codigo;
   }

}
