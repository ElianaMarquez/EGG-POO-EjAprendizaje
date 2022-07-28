
package ejercicio12guia7;

import Entidades.Persona;
import Servicios.PersonaServicio;


public class Ejercicio12Guia7 {

   
    public static void main(String[] args) {
     PersonaServicio ps = new PersonaServicio();
     Persona pers1 = ps.crearPersona();
     ps.calcularEdad(pers1);
     ps.menorQue(pers1, 38);
     ps.mostrarPersona(pers1);
    }
    
}
