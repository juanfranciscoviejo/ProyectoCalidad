/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopf;

/**
 *
 * @author Carlos
 */
public class CE extends Transacciones {

    private int fS; //Atributos de la SE
    private int eS; //Atributos de la SE

    public CE(String d, int f, int e, int fS, int eS) {
        super(d, f, e);
        this.fS = fS;
        this.eS = eS;
    }

    public String complejidad_S() { //Complejidad de la SE
        String s = "";
        if (eS <= 5 && fS <= 3) {
            s = "S";
        } else if (eS <= 5 && fS >= 4) {
            s = "M";
        } else if (eS >= 6 && eS <= 19 && fS < 2) {
            s = "S";
        } else if (eS >= 6 && (eS <= 19 && fS == 2 || fS == 3)) {
            s = "M";
        } else if (eS >= 6 && eS <= 19 && fS >= 4) {
            s = "C";
        } else if (eS >= 20 && fS <= 1) {
            s = "M";
        } else if (eS >= 20 && fS > 2) {
            s = "C";
        }
        return s;
    }

    public String complejidad() { //Complejidad de la EE con la SE
        String s = "";
        if (getElementales() <= 4 && getFicheros() <= 2) {
            s = "S";
        } else if (getElementales() <= 4 && getFicheros() >= 3) {
            s = "M";
        } else if (getElementales() >= 5 && getElementales() <= 15 && getFicheros() < 2) {
            s = "S";
        } else if (getElementales() >= 5 && getElementales() <= 15 && getFicheros() == 2) {
            s = "M";
        } else if (getElementales() >= 5 && getElementales() <= 15 && getFicheros() > 2) {
            s = "C";
        } else if (getElementales() >= 16 && getFicheros() <= 1) {
            s = "M";
        } else if (getElementales() >= 16 && getFicheros() == 2) {
            s = "C";
        } else if (getElementales() >= 16 && getFicheros() >= 3) {
            s = "C";
        }

        String a = complejidad_S();
        if (s == "S" && a != "S") {
            s = a;
        } else if (s == "M" && a == "C") {
            s = a;
        }

        return s;
    }

}
