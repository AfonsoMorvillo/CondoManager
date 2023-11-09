
package model;

import controller.DataAccessObject;
import java.util.ArrayList;
import utils.Select;

public class Casa extends DataAccessObject{
    private int numero;
    private String bloco;
    private int idProprietario;
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
    
    public int getIdProprietario() {
        return idProprietario;
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
        if(idProprietario != this.idProprietario){
        this.idProprietario = idProprietario;
        addChange("idProprietario", this.idProprietario);
        }
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
