/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entidad;

/**
 *
 * @author christian
 */
public class Alergias {
    private int idAlergias;
    private String descripcion;

    public Alergias(int idAlergias, String descripcion) {
        this.idAlergias = idAlergias;
        this.descripcion = descripcion;
    }

    public Alergias() {
    }

    public Alergias(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdAlergias() {
        return idAlergias;
    }

    public void setIdAlergias(int idAlergias) {
        this.idAlergias = idAlergias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
