/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGB.Modelo.Entidades;

/**
 *
 * @author Marvin
 */
public class Tipo {

    private String pn_descripcion;

    public Tipo(String pn_descripcion) {
        this.pn_descripcion = pn_descripcion;
    }

    public Tipo() {
        pn_descripcion = "";
    }

    public String getPn_descripcion() {
        return pn_descripcion;
    }

    public void setPn_descripcion(String pn_descripcion) {
        this.pn_descripcion = pn_descripcion;
    }

    @Override
    public String toString() {
        return "Tipo{" + ", pn_descripcion=" + pn_descripcion + '}';
    }

}
