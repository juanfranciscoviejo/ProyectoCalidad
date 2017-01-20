/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopf;

import java.util.ArrayList;

/**
 *
 * @author Juan Francisco
 */
public class Transacciones {

    private String denominacion;
    private int ficheros;
    private int elementales;

    private ArrayList<EE> listaEE = new ArrayList<EE>();
    private ArrayList<SE> listaSE = new ArrayList<SE>();
    private ArrayList<GLDI> listaGLDI = new ArrayList<GLDI>();
    private ArrayList<GLDE> listaGLDE = new ArrayList<GLDE>();
    private ArrayList<CE> listaCE = new ArrayList<CE>();

    public Transacciones(String d, int f, int e) {
        denominacion = d;
        ficheros = f;
        elementales = e;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public int getFicheros() {
        return ficheros;
    }

    public int getElementales() {
        return elementales;
    }

    public void addEE(EE e) {
        listaEE.add(e);
    }

    public ArrayList<EE> getlistaEE() {
        return listaEE;
    }

    public void addSE(SE e) {
        listaSE.add(e);
    }

    public ArrayList<SE> getlistaSE() {
        return listaSE;
    }

    public void addGLDI(GLDI e) {
        listaGLDI.add(e);
    }

    public ArrayList<GLDI> getlistaGLDI() {
        return listaGLDI;
    }

    public void addGLDE(GLDE e) {
        listaGLDE.add(e);
    }

    public ArrayList<GLDE> getlistaGLDE() {
        return listaGLDE;
    }

    public void addCE(CE e) {
        listaCE.add(e);
    }

    public ArrayList<CE> getlistaCE() {
        return listaCE;
    }

}
