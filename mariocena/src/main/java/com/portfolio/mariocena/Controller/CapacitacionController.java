package com.portfolio.mariocena.Controller;

import com.portfolio.mariocena.Entity.Capacitacion;
import com.portfolio.mariocena.Interface.ICapacitacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CapacitacionController {
    
  @Autowired ICapacitacionService icapacitacionservice;

@GetMapping("/capacitacion/traer")
public List<Capacitacion> getCapacitacion(){
    return icapacitacionservice.getCapacitacion();
}


 @PostMapping("/capacitacion/crear")
 public String createCapacitacion(@RequestBody Capacitacion capacitacion){
 icapacitacionservice.saveCapacitacion(capacitacion);
 return "la capacitacion se agregó correctamente";
 }
 
 @DeleteMapping("/capacitacion/borrar/{id}")
 public String deleteCapacitacion (@PathVariable Long id){
 icapacitacionservice.deleteCapacitacion(id);
 return "la capacitacióm se borro correctamente";
 }
 
 @PutMapping("/capacitacion/editar/{id}")
 public Capacitacion editCapacitacion(@PathVariable Long id,
                            @RequestParam("nombreCapacitacion") String NuevoNombreCapacitacion,
                            @RequestParam("Lugar") String NuevoLugar                            
                            ){
     
 Capacitacion capacitacion = icapacitacionservice.findCapacitacion(id);

 capacitacion.setNombreCapacitacion(NuevoNombreCapacitacion);
 capacitacion.setLugar(NuevoLugar);
 icapacitacionservice.saveCapacitacion(capacitacion);
 
 return capacitacion;


 }
 
@GetMapping("/capacitacion/traer/perfil")
public Capacitacion findCapacitacion(){
    return icapacitacionservice.findCapacitacion((long)1);
    
}

    
    
}
