package com.portfolio.mariocena.Service;

import com.portfolio.mariocena.Entity.Capacitacion;
import com.portfolio.mariocena.Interface.ICapacitacionService;
import com.portfolio.mariocena.Repository.ICapacitacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpCapacitacionService implements ICapacitacionService {

@Autowired ICapacitacionRepository  icapacitacionrepository;

    
    @Override
    public List<Capacitacion> getCapacitacion() {
       List <Capacitacion> capacitacion = icapacitacionrepository.findAll();
       return capacitacion;
    }

    @Override
    public void saveCapacitacion(Capacitacion capacitacion) {
    icapacitacionrepository.save(capacitacion);
    
    }

    @Override
    public void deleteCapacitacion(Long id) {
     icapacitacionrepository.deleteById(id);
    }

    @Override
    public Capacitacion findCapacitacion(Long id) {
    Capacitacion capacitacion = icapacitacionrepository.findById(id).orElse(null);
    return capacitacion;
    }


    
}
