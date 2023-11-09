
package model;

import controller.DataAccessObject;
import java.util.ArrayList;
import utils.Select;


public class Veiculos extends DataAccessObject  {
  private String placaCarro;
  private String modelo;
  private String marca;
  private String tipo;
  private String cor;
  private String ano;
  private int casa;
  
    public Veiculos() {
        super("Veículos");
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
    
    public int getCasa(){
        return casa;
    }

    public void setPlacaCarro(String placaCarro) {
        if( !placaCarro.equals((this.placaCarro))){
        this.placaCarro = placaCarro;
        addChange("placaCarro", this.placaCarro);
        }
    }

    public void setModelo(String modelo) {
    
        if( !modelo.equals((this.modelo))){
        this.modelo = modelo;
        addChange("modelo", this.modelo);
        }
    }

    public void setMarca(String marca) {
        if( !marca.equals((this.marca))){
        this.marca = marca;
        addChange("marca", this.marca);
        }
    }

    public void setTipo(String tipo) {
        if( !tipo.equals((this.tipo))){
        this.tipo = tipo;
        addChange("tipo", this.tipo);
        }
    }

    public void setCor(String cor) {
        if( !cor.equals((this.cor))){
        this.cor = cor;
        addChange("cor", this.cor);
        }
    }

    public void setAno(String ano) {
      
        if( !ano.equals((this.ano))){
        this.ano = ano;
        addChange("ano", this.ano);
        }
    }
    
    public void setCasa(int casa) {
        if(casa != this.casa){
        this.casa = casa;
        addChange("casa", this.casa);
        }
    }
    
    @Override
    protected String getWhereClauseForOneEntry() {
        return " placaCarro = '" +this.placaCarro+"'";

    }

    @Override
    protected void fill(ArrayList<Object> data) {
//        this.placaCarro = (int)data.get(0);
//        this.modelo=(String) data.get(1);
//        this.marca=(String) data.get(2);
//        this.tipo=(String) data.get(3);
//        this.cor=(String) data.get(4);
//        this.ano=(String) data.get(5);

                
                                
    }
    
     public void carregar( Veiculos instance, String whereClause ) {
      setPlacaCarro(whereClause );

      Select select = new Select();

      select.add( "modelo" );
      select.add( "marca" );
      select.add( "tipo" );
      select.add( "cor" );
      select.add( "ano" );
      select.add( "casa" );

      instance.fill( select.build(), instance );
   }
    
}
