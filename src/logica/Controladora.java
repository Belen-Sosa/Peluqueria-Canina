/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author Belen
 */
public class Controladora {
    ControladoraPersistencia controlPersis= new ControladoraPersistencia();
    
    
    public void crearMascota(String numCliente, String nombrePerro, String raza, String color, String Alergico, String atencionEspecial, String nombreDuenio,String celularDuenio, String observaciones){
      Perro mascota= new Perro();
      mascota.setNumCliente(numCliente);
      mascota.setNombrePerro(nombrePerro);
      mascota.setRaza(raza);
      mascota.setColor(color);
      mascota.setAlergico(Alergico);
      mascota.setAtencionEspecial(atencionEspecial);
      mascota.setNombreDuenio(nombreDuenio);
      mascota.setCelularDuenio(celularDuenio);
      mascota.setObservaciones(observaciones);
      controlPersis.crearMascota(mascota);
      
      
    }
    
    
    public void crearMascota(Perro mascota){
        controlPersis.crearMascota(mascota);
    
    }
    
    
    
     public void eliminarMascota(Perro mascota){
    
    controlPersis.eliminarMascota(mascota);
    }
    
    public List<Perro> obtenerMascotas () {
    
     return controlPersis.obtenerMascotas();
    }
    
    
    
    public void modificarMascota(Perro mascota){
    
    
    controlPersis.ModificarMascota(mascota);
    }
    
    public Perro buscarHuesped(Perro mascota){
    
    return controlPersis.buscarMascota(mascota);
    }
    
}
