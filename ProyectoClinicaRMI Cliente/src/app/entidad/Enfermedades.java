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
public class Enfermedades {
    private int idEnfermedades;
    private String descripcion;
    private String tratamiento;
    
    public Enfermedades(){ 
    }

    public Enfermedades(String descripcion, String tratamiento) {
        this.descripcion = descripcion;
        this.tratamiento = tratamiento;
    }
    
    
    public Enfermedades(int idEnfermedades, String descripcion, String tratamiento) {
        this.idEnfermedades = idEnfermedades;
        this.descripcion = descripcion;
        this.tratamiento = tratamiento;
    }

    public int getIdEnfermedades() {
        return idEnfermedades;
    }

    public void setIdEnfermedades(int idEnfermedades) {
        this.idEnfermedades = idEnfermedades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
}
