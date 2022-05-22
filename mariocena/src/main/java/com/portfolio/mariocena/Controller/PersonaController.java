package com.portfolio.mariocena.Controller;

import com.portfolio.mariocena.Entity.Persona;
import com.portfolio.mariocena.Interface.IPersonaService;
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
public class PersonaController {
    
 @Autowired IPersonaService ipersonaService;
 
 @GetMapping("/personas/traer")
 public List<Persona> getPersona(){
     return ipersonaService.getPersona();
 }
 
 
 @PostMapping("/personas/crear")
 public String createPersona(@RequestBody Persona persona){
 ipersonaService.savePersona(persona);
 return "la persona se creo correctamente";
 }
 
 @DeleteMapping("/persona/borrar/{id}")
 public String deletePersona (@PathVariable Long id){
 ipersonaService.deletePersona(id);
 return "la persona se borro correctamente";
 }
 
 @PutMapping("/persona/editar/{id}")
 public Persona editPersona(@PathVariable Long id,
                            @RequestParam("nombre") String NuevoNombre,
                            @RequestParam("apellido") String NuevoApellido,
                            @RequestParam("edad") String NuevaEdad,
                            @RequestParam("presentacion") String NuevoPresentacion,
                            @RequestParam("telefono") String NuevoTelefono,
                            @RequestParam("correo") String NuevoCorreo,
                            @RequestParam("dni") String NuevoDni,
                            @RequestParam("fechanac") String NuevaFecha,
                            @RequestParam("estadocivil") String NuevoEstadoCivil
                            ){
 Persona persona = ipersonaService.findPersona(id);

 persona.setNombre(NuevoNombre);
 persona.setApellido(NuevoApellido);
 persona.setEdad(NuevaEdad);
 persona.setPresentacion(NuevoPresentacion);
 persona.setTelefono(NuevoTelefono);
 persona.setCorreo(NuevoCorreo);
 persona.setDni(NuevoDni); 
 persona.setFechanac(NuevoDni);
 persona.setEstadocivil(NuevoEstadoCivil);

 ipersonaService.savePersona(persona);
 return persona;


 }
 
@GetMapping("/personas/traer/perfil")
public Persona findPersona(){
    return ipersonaService.findPersona((long)1);
}
}
