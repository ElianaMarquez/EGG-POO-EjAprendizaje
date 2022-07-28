
 
package ejercicio2guia7;

import Entidades.Circunferencia;
import Servicios.CircunferenciaServicios;




public class Ejercicio2Guia7 {

    
    public static void main(String[] args) {
      
        CircunferenciaServicios cs = new CircunferenciaServicios();
        Circunferencia circ1 = cs.crearCircunferencia();
        cs.calculaArea(circ1);
        cs.calculaPerimetro(circ1);
        
        
    }
    
}
