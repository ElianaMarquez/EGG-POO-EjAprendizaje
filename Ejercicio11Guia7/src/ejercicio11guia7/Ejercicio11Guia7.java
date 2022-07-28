
package ejercicio11guia7;

import java.util.Date;
import java.util.Scanner;


public class Ejercicio11Guia7 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      /*En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date.*/
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio-1900, mes, dia);
        
        /* Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();*/
        System.out.println(fecha.toString());
        
        Date fechaActual = new Date();
        
        System.out.println(fechaActual);
        System.out.println("Diferencia entre el año ingresado y el alo actual es:"+ (anio-2022));
        
    }
    
}
