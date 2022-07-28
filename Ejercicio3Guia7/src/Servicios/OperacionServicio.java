
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;


public class OperacionServicio {
    
    public Operacion crearOperacion(){
        Operacion op = new Operacion();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el valor del primer número");
        op.setNumero1(leer.nextInt());
        System.out.println("Ingrese el valor del segundo número");
        op.setNumero2(leer.nextInt());
        
      return op;  
    }
    
    public void sumaNumeros(Operacion op){
        int suma = op.getNumero1() + op.getNumero2();
        System.out.println("La suma de los números " + op.getNumero1() + " y " + op.getNumero2() + " es " + suma ); 
    }
     public void restaNumeros(Operacion op){
        int resta = op.getNumero1() - op.getNumero2();
        System.out.println("La resta de los números " + op.getNumero1() + " y " + op.getNumero2() + " es " + resta); 
    }
     public void multiplicacionNumeros(Operacion op){
        int mult = op.getNumero1() * op.getNumero2();
        if (op.getNumero1()<1 || op.getNumero2()<1){
            System.out.println("La multiplicación  es: " + mult );
            System.out.println(" ERROR, No se puede multiplicar por 0");
        } else{
        System.out.println("La multiplicación de los números " + op.getNumero1() + " y " + op.getNumero2() + " es " + mult); 
        }
    }
      public void divisionNumeros(Operacion op){
        if (op.getNumero2()<1){
            System.out.println("La división es: 0");
            System.out.println(" ERROR, No se puede dividir por 0");
        } else{
              int div = op.getNumero1() / op.getNumero2();
        System.out.println("La división de los números " + op.getNumero1() + " y " + op.getNumero2() + " es " + div); 
        }
    }    
        
                 

}
