package com.portfolio.mariocena.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter

public class Trabajo {
    
 @Id
 @GeneratedValue (strategy = GenerationType.IDENTITY)
 private long id;
 
 private String nombreTrabajo;
 private String cargo;
 
 @NotNull
 @Size(min=1, max=300, message = "no cumple con las condiciones")
 private String descripcion;
    
}
