
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;


public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    /*Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.*/
    public Persona crearPersona(){
        // instanciar un objeto persona
        Persona pers = new Persona();
        System.out.println("Cuál es su nombre??");
        pers.setNombre(leer.next());
        System.out.println("Su día de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Su mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Su año de nacimiento");
        int anio = leer.nextInt();
        
        Date fechaDeNac = new Date(anio-1900, mes-1, dia);
        
        pers.setFechaNac(fechaDeNac);
        
        return pers;
    }
    public void calcularEdad(Persona pers){
        Date fechaActual = new Date();
      double fechaNacMiliseg = pers.getFechaNac().getTime();
      double fechaActualMiliseg = fechaActual.getTime();
      double edadMiliseg = fechaActualMiliseg - fechaNacMiliseg;
      int edad =(int) ( edadMiliseg/1000/60/60/24/365);
      pers.setEdad(edad);
      
        System.out.println("Su edad es: "+ edad + "años");
    }
    public void menorQue(Persona pers, int otraEdad){
        
        System.out.println(pers.getNombre() +" tiene menor edad que la recibida como parámetro?");
        boolean menor = pers.getEdad()<(otraEdad);
        System.out.println(menor);
    }
    public void mostrarPersona(Persona pers){
        System.out.println(pers.toString());
    }
    
}
