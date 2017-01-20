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
public class GLDE extends Transacciones {

    public GLDE(String d, int f, int e) {
        super(d, f, e);
    }

    public String complejidad() {
        String s = "";
        if (getElementales() <= 19 && getFicheros() <= 5) {
            s = "S";
        } else if (getElementales() <= 19 && getFicheros() >= 6) {
            s = "M";
        } else if (getElementales() >= 20 && getElementales() <= 50 && getFicheros() == 1) {
            s = "S";
        } else if (getElementales() >= 20 && getElementales() <= 50 && getFicheros() >= 2 && getFicheros() <= 5) {
            s = "M";
        } else if (getElementales() >= 20 && getElementales() <= 50 && getFicheros() >= 6) {
            s = "C";
        } else if (getElementales() >= 51 && getFicheros() == 1) {
            s = "M";
        } else if (getElementales() >= 51 && getFicheros() >= 2 && getFicheros() <= 5) {
            s = "C";
        } else if (getElementales() >= 51 && getFicheros() >= 6) {
            s = "C";
        }
        return s;
    }

}
