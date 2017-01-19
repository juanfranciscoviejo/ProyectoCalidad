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
public class EE extends Transacciones {

    public EE(String d, int f, int e) {
        super(d, f, e);
    }

    public String complejidad() {
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
        return s;
    }

}
