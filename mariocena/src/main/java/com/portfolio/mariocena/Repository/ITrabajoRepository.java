package com.portfolio.mariocena.Repository;

import com.portfolio.mariocena.Entity.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITrabajoRepository extends JpaRepository<Trabajo,Long> {
    
}
