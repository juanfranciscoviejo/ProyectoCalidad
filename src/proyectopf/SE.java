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
public class SE extends Transacciones {

    public SE(String d, int f, int e) {
        super(d, f, e);
    }

    public String complejidad() {
        String s = "";
        if (getElementales() <= 5 && getFicheros() <= 3) {
            s = "S";
        } else if (getElementales() <= 5 && getFicheros() >= 4) {
            s = "M";
        } else if (getElementales() >= 6 && getElementales() <= 19 && getFicheros() < 2) {
            s = "S";
        } else if (getElementales() >= 6 && (getElementales() <= 19 && getFicheros() == 2 || getFicheros() == 3) ) {
            s = "M";
        } else if (getElementales() >= 6 && getElementales() <= 19 && getFicheros() >= 4) {
            s = "C";
        } else if (getElementales() >= 20 && getFicheros() <= 1) {
            s = "M";
        } else if (getElementales() >= 20 && getFicheros() >2) {
            s = "C";
        } 
        return s;
    }

}
