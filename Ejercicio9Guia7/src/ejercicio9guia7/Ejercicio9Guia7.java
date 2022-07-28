
package ejercicio9guia7;

import Entidades.Matematica;
import Servicios.MatematicaServicios;


public class Ejercicio9Guia7 {

   
    public static void main(String[] args) {
        MatematicaServicios ms = new MatematicaServicios();
        Matematica objMate = new Matematica();
        
        objMate.setNum1((double) (Math.random()*100));
        objMate.setNum2((double) (Math.random()*100));
        System.out.println("Los números seleccionados aleatoriamente son: ");
        System.out.println(objMate.getNum1());
        System.out.println(objMate.getNum2());
        
        ms.devolverMayor(objMate);
        ms.calcularPotencia(objMate);
        ms.calculaRaiz(objMate);
        
        
    }
    
}
