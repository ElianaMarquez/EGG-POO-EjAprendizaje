
package ejercicio5guia7;

import Entidades.Cuenta;
import Servicios.cuentaServicio;
import java.util.Scanner;

public class Ejercicio5Guia7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        cuentaServicio cs = new cuentaServicio();
        Cuenta cta = cs.crearCuenta();
        cs.ingresaDinero(cta);
        cs.retiraDinero(cta);
        cs.extraccionRapida(cta);
        cs.consultarSaldo(cta);
        cs.consultarDatos(cta);
    }
    
}
/* menu
System.out.println("1. Crear nueva Cuenta\n2. Ingresar Dinero\n3. Retirar Dinero\n"
                    + "4. Realizar una extraccion rápida\n5. Consultar Saldo\n6. Consultar datos"
                    + "de la cuenta\n0. Salir");

*/