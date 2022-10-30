package com.portfolio.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity

public class Persona 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con los caracteres maximos y minimos")
    private String nombre;
    
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con los caracteres maximos y minimos")
    private String Apellido;
    
    
    @NotNull
    private String description;
    
    
    private String img;

    public Persona() {
    }

    public Persona(String nombre, String Apellido, String description, String img) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.description = description;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
    
}
