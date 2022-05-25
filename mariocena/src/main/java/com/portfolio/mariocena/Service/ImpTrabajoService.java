
package com.portfolio.mariocena.Service;

import com.portfolio.mariocena.Entity.Capacitacion;
import com.portfolio.mariocena.Entity.Trabajo;
import com.portfolio.mariocena.Interface.ITrabajoService;
import com.portfolio.mariocena.Repository.ITrabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpTrabajoService implements ITrabajoService {

@Autowired ITrabajoRepository itrabajorepository;    
    
    
    @Override
    public List<Trabajo> getTrabajo() {
    List <Trabajo> trabajo = itrabajorepository.findAll();
    return trabajo;
    }

    @Override
    public void saveTrabajo(Trabajo trabajo) {
    itrabajorepository.save(trabajo);
    
    }

    @Override
    public void deleteTrabajo(Long id) {
    itrabajorepository.deleteById(id);
    }

    @Override
    public Trabajo findTrabajo(Long id) {
        Trabajo trabajo = itrabajorepository.findById(id).orElse(null);
     return trabajo;  
    }
    
}
