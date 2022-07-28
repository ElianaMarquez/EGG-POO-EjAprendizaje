
package ejercicio7guia7;

import Entidades.Persona;
import Servicios.PersonaServicios;


public class Ejercicio7Guia7 {

   
    public static void main(String[] args) {
        PersonaServicios ps = new PersonaServicios();
        
        Persona pers1 = ps.crearPersona();
        ps.calcularIMC(pers1);
        ps.esMayorDeEdad(pers1);
        
        System.out.println("\n*********");
        
          Persona pers2 = ps.crearPersona();
        ps.calcularIMC(pers2);
        ps.esMayorDeEdad(pers2);
        
         System.out.println("\n*********");
        
          Persona pers3 = ps.crearPersona();
        ps.calcularIMC(pers3);
        ps.esMayorDeEdad(pers3);
        
         System.out.println("\n*********");
        
          Persona pers4 = ps.crearPersona();
        ps.calcularIMC(pers4);
        ps.esMayorDeEdad(pers4);
        
         System.out.println("\n*********");
        
    }
    
}
