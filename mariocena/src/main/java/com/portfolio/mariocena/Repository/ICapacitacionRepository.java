package com.portfolio.mariocena.Repository;

import com.portfolio.mariocena.Entity.Capacitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICapacitacionRepository extends JpaRepository<Capacitacion,Long>{
    
}
