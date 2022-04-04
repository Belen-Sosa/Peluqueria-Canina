
package persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Perro;
import persistencia.exceptions.NonexistentEntityException;
import java.util.List;


public class ControladoraPersistencia {
    PerroJpaController perroJPA= new PerroJpaController();
    
    
    
    //metodo para alta
    public void crearMascota( Perro perro){
        try{
        perroJPA.create(perro);
        }catch( Exception e){
        
            System.out.println("La mascota no se pudo crear.");
        }
    }
    
    
    
    //metodo para baja 
    
    public void eliminarMascota(Perro perro){
    
        try {
            perroJPA.destroy(  Integer.parseInt( perro.getNumCliente()));
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    //metodo para lectura 
    
    
    
    public List<Perro> obtenerMascotas(){
        return perroJPA.findPerroEntities();
  
    }
    
    //metodo apra modificacion 
    
    
    public void ModificarMascota(Perro mascota){
      try{
    
    perroJPA.edit(mascota);
    
    }catch(Exception ex){
        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    public Perro buscarMascota(Perro mascota){
          
       return perroJPA.findPerro(Integer.parseInt(mascota.getNumCliente()));
    }
}
