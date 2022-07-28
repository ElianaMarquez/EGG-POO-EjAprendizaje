
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;


public class cuentaServicio {
    
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cuenta crearCuenta() {
    Cuenta cta1 = new Cuenta();
        System.out.println("Ingrese el número de cuenta");
        cta1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        cta1.setDni(leer.nextLong());
        System.out.println("Ingrese su Saldo Actual");
        cta1.setSaldoActual(leer.nextDouble());
        return cta1;
}
    public void ingresaDinero(Cuenta cta1) {
        System.out.println("Monto de dinero a ingresar:");
        double ingreso = leer.nextDouble();
        cta1.setSaldoActual(cta1.getSaldoActual()+ingreso);
        System.out.println("Su saldo Actual es de " + cta1.getSaldoActual());
    }
     public void retiraDinero(Cuenta cta1) {
        System.out.println("Monto de dinero a retirar:");
        double retiro = leer.nextDouble();
        if (retiro > cta1.getSaldoActual()){
            cta1.setSaldoActual(0);
            System.out.println("Su saldo es; "+ cta1.getSaldoActual());
        }else {
        cta1.setSaldoActual(cta1.getSaldoActual()- retiro);
        System.out.println("Su saldo Actual es de " + cta1.getSaldoActual());
     }
     }
     public void extraccionRapida (Cuenta cta1){
         System.out.println("Ingrese el monto a retirar");
         double retiro = leer.nextDouble();
         if (cta1.getSaldoActual()*0.20 < retiro){
             System.out.println("El monto ingresado supera el 20% de su saldo, no se puede realizar la operación");
         }else {
              cta1.setSaldoActual(cta1.getSaldoActual()- retiro);
        System.out.println("Su saldo Actual es de " + cta1.getSaldoActual());
         }
     }
     public void consultarSaldo (Cuenta cta1){
         System.out.println("El saldo disponible en su cuenta es: " + cta1.getSaldoActual());
     }
     public void consultarDatos(Cuenta cta1){
         System.out.println("DATOS DE SU CUENTA:");
         System.out.println(cta1.toString());
                 
     }
}
