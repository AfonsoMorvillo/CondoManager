
package model;

import controller.DataAccessObject;
import java.util.ArrayList;

public class Casa extends DataAccessObject{
    private int numeroCasa;
    private String bloco;
    private String dependentesTitular;
    
    public Casa() {
        super("casa");
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public String getBloco() {
        return bloco;
    }

    public String getDependentesTitular() {
        return dependentesTitular;
    }

    public void setNumeroCasa(int numeroCasa) {
        if(numeroCasa != this.numeroCasa){
        this.numeroCasa = numeroCasa;
        addChange("numeroCasa", this.numeroCasa);
        }
    }

    public void setBloco(String bloco) {
        if( !bloco.equals((this.bloco))){
        this.bloco = bloco;
        addChange("bloco", this.bloco);
        }
    }

    public void setDependentesTitular(String dependentesTitular) {
        if(!dependentesTitular.equals((this.dependentesTitular))){
        this.dependentesTitular = dependentesTitular;
        addChange("dependentesTitular", this.dependentesTitular);
        }
    }
    
    

    @Override
    protected String getWhereClauseForOneEntry() {
        return " numeroCasa = " +this.numeroCasa;
    }

    @Override
    protected void fill(ArrayList<Object> data) {
        this.numeroCasa = (int)data.get(0);
        this.bloco=(String) data.get(1);
        this.dependentesTitular=(String) data.get(2);
    }
    
}
