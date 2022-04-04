/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Belen
 */
@Entity
public class Perro implements Serializable {
    @Id
    
    private String numCliente;
    @Basic
    private String nombrePerro;
    private String raza;
    private String color;
    private String Alergico;
    private String atencionEspecial;
    private String nombreDuenio;
    private String celularDuenio;
    private String observaciones;

    public Perro() {
    }

    public Perro(String numCliente, String nombrePerro, String raza, String color, String Alergico, String atencionEspecial, String nombreDuenio,String celularDuenio, String observaciones) {
        this.numCliente = numCliente;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.color = color;
        this.Alergico = Alergico;
        this.atencionEspecial = atencionEspecial;
        this.nombreDuenio = nombreDuenio;
        this.celularDuenio= celularDuenio;
        this.observaciones = observaciones;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return Alergico;
    }

    public void setAlergico(String Alergico) {
        this.Alergico = Alergico;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }
     public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }
     public String getCelularDuenio() {
        return celularDuenio;
    }

  public void setCelularDuenio(String celularDuenio) {
        this.celularDuenio = celularDuenio;
    }
   

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
