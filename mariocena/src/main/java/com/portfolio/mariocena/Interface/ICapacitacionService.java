package com.portfolio.mariocena.Interface;

import com.portfolio.mariocena.Entity.Capacitacion;
import java.util.List;

public interface ICapacitacionService {

//traer una lista de capacitaciones//
    
   public List <Capacitacion> getCapacitacion();
   
 //guardar capacitacion//
    
    public void saveCapacitacion( Capacitacion capacitacion);
 
//eliminar por ID//
    
   public void deleteCapacitacion (Long id);
   
    //buscar capacitacion por id//
   
   public Capacitacion findCapacitacion(Long id);
        
    
    
            
    
    
    
}
