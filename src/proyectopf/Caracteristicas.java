/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopf;

/**
 *
 * @author Juan Francisco
 */
public class Caracteristicas {
    private double factor_Ajuste; //Factor de ajuste
    private int sva; //Suma de los valores de los atributos

    public Caracteristicas() {
        this.factor_Ajuste = 0;
        this.sva = 0;
    }
  
    public double getFactor_Ajuste() {
        return factor_Ajuste;
    }

    public void setFactor_Ajuste(double factor_Ajuste) {
        this.factor_Ajuste = factor_Ajuste;
    }

    public int getSva() {
        return sva;
    }

    public void setSva(int sva) {
        this.sva = sva;
    }
    
    public double calculoFactorAjuste(){
        return this.factor_Ajuste= 0.65 + (0.01 * this.getSva()); //factor ajuste
    }

}
