
package com.portfolio.mariocena.Interface;

import com.portfolio.mariocena.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer personas//
    
    public List<Persona> getPersona();
    
    //guardar persona//
    
    public void savePersona( Persona persona);
    //eliminar por ID//
    public void deletePersona (Long id);
    //buscar pesona por id//
   public Persona findPersona(Long id);
    
}
