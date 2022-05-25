package com.portfolio.mariocena.Interface;

import com.portfolio.mariocena.Entity.Capacitacion;
import com.portfolio.mariocena.Entity.Trabajo;
import java.util.List;

public interface ITrabajoService {

    
        //traer Trabajos//
    
    public List<Trabajo> getTrabajo();
    
    //guardar trabajo//
    
    public void saveTrabajo( Trabajo trabajo);
    
    //eliminar por ID//
    public void deleteTrabajo (Long id);
    
    //buscar trabajo por id//
   public Trabajo findTrabajo(Long id);


    
}
