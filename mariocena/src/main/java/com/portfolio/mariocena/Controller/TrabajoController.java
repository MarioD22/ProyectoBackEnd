package com.portfolio.mariocena.Controller;

import com.portfolio.mariocena.Entity.Trabajo;
import com.portfolio.mariocena.Interface.ITrabajoService;
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
public class TrabajoController {
 
 @Autowired ITrabajoService itrabajoservice;
 
 
 
 @GetMapping("/trabajo/traer")
 public List<Trabajo> getTrabajo(){
     return  itrabajoservice.getTrabajo();
     
 }
 
 
 @PostMapping("/trabajo/crear")
 public String createTrabajo(@RequestBody Trabajo trabajo){
    itrabajoservice.saveTrabajo(trabajo);
 
 return "el trabajo se creo correctamente";
 }
 
 @DeleteMapping("/trabajo/borrar/{id}")
 public String deleteTrabajo (@PathVariable Long id){
     
 itrabajoservice.deleteTrabajo(id);
 
 return "el trabajo se borro correctamente";
 }
 
 @PutMapping("/trabajo/editar/{id}")
 public Trabajo editTrabajo(@PathVariable Long id,
                            @RequestParam("nombreTrabajo") String NuevonombreTrabajo,
                            @RequestParam("cargo") String Nuevocargo,
                            @RequestParam("descripcion") String Nuevadescripcion){
 Trabajo trabajo = itrabajoservice.findTrabajo(id);
 trabajo.setNombreTrabajo(NuevonombreTrabajo);
 trabajo.setCargo(Nuevocargo);
 trabajo.setDescripcion(Nuevadescripcion);
 
 itrabajoservice.saveTrabajo(trabajo);
 return trabajo;    
      }
 
@GetMapping("/personas/traer/perfil")
public Trabajo findTrabajo(){
    return itrabajoservice.findTrabajo((long)1);
}
 
 
    
    
}
