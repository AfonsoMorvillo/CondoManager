
package model;

import controller.DataAccessObject;
import java.util.ArrayList;
import utils.Select;

public class Casa extends DataAccessObject{
    private int numero;
    private String bloco;
    private Proprietario proprietario;
    private int vagas;
    private String dataRegistro;
    
    public Casa() {
        super("Casa");
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

    public void setNumero(int numero) {
        if(numero != this.numero){
        this.numero = numero;
        addChange("numero", this.numero);
        }
    }

    public void setBloco(String bloco) {
        if( !bloco.equals((this.bloco))){
        this.bloco = bloco;
        addChange("bloco", this.bloco);
        }
    }

    
     public void setIdProprietario(int idProprietario) {
        
    	 if( proprietario == null ) {
    		 proprietario = new Proprietario();
         }           
         
    	 proprietario.setIdProprietario(
    			 idProprietario );
         proprietario.carregar(this.proprietario, idProprietario);;
    	 
    }
    
      public void setVagas(int vagas) {
         if(vagas != this.vagas){
        this.vagas = vagas;
        addChange("vagas", this.vagas);
        }
    }
      
      public void setDataRegistro(String dataRegistro) {
        if( !dataRegistro.equals((this.dataRegistro))){
        this.dataRegistro = dataRegistro;
        addChange("dataRegistro", this.dataRegistro);
        }
    }
      
      public void setProprietario(Proprietario proprietario) {
    	  
    	  if( this.proprietario  == null ) {
              
              if( proprietario != null ) {
                  
                  this.proprietario = new Proprietario();
                  this.proprietario.setIdProprietario(proprietario.getIdProprietario());
                  this.proprietario.carregar(this.proprietario, proprietario.getIdProprietario());
                  addChange("idProprietario", this.proprietario.getIdProprietario());
                  
              }
              
          } else {
              
              if( proprietario == null ) {
                  
                  this.proprietario = null;
                  addChange("idProprietario", null );
                  
              } else {
                  
                  if( !this.proprietario.equals( proprietario ) ) {
                      
                      this.proprietario.setIdProprietario(proprietario.getIdProprietario());
                      this.proprietario.carregar(this.proprietario, proprietario.getIdProprietario());
                      addChange("idProprietario", this.proprietario.getIdProprietario());
                      
                  }
                  
              }
          }
      }

    @Override
    protected String getWhereClauseForOneEntry() {
        return " numero = " +this.numero;
    }

    @Override
    protected void fill(ArrayList<Object> data) {
       
    }
    
     public void carregar( Casa instance, int whereClause ) {
      setNumero(whereClause );

      Select select = new Select();

      select.add( "numero" );
      select.add( "bloco" );
      select.add( "dataRegistro" );
      select.add( "vagas" );
      select.add( "idProprietario" );

      instance.fill( select.build(), instance );
   }
    
}
