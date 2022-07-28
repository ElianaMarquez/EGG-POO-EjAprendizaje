
package Entidades;

import java.util.Date;


public class Persona {
    //atributos
    private String nombre;
    private Date fechaNac;
    private int edad;
    
    //constructores

    public Persona() {
    }

    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }
    
    public int getEdad() {
        return edad;
    }

    //getter y setter
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Persona: " + "\n nombre= " + nombre + "\n fechaNac= " + fechaNac + "\n edad= " + edad ;
    }
    
    
    
}
