
package ejercicio3guia7;

import Entidades.Operacion;
import Servicios.OperacionServicio;

public class Ejercicio3Guia7 {

    
    public static void main(String[] args) {
     
        OperacionServicio os = new OperacionServicio();
        Operacion op1 = os.crearOperacion();
        os.sumaNumeros(op1);
        os.restaNumeros(op1);
        os.multiplicacionNumeros(op1);
        os.divisionNumeros(op1);
        
        
    }
    
}
