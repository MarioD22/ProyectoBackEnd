
package com.portfolio.mariocena.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter @Setter
public class Persona {
    
    
    
     @Id
     @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  long id;
    
    private  String nombre;
   
    private  String apellido;
   
    private  String edad;
  
    private  String presentacion;
   
    private  String telefono;
   
    private  String correo;
    
    private  String dni;
    
    private  String fechanac;
    
    private  String estadocivil;

   }
