
package ejercicio10guia7;

import java.util.Arrays;


public class Ejercicio10Guia7 {

    
    public static void main(String[] args) {
        
        double [] arregloA = new double[50];
        double [] arregloB = new double [20];
        
        //inicializar el arreglo A con números aleatorios
        System.out.println("Inicializar el arreglo A con números aleatorios");
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (int) (Math.random()*100);
        }
        imprimirArreglo(arregloA);           

        
      //el arreglo A se debe ordenar de mayor a menor
        System.out.println("El arreglo A se debe ordenar de mayor a menor");
        Arrays.sort(arregloA);
        imprimirArreglo(arregloA);
        
        //copiar los primeros 10 números ordenados al arreglo B de 20 elementos
        //y rellenar los 10 ultimos elemnetos con el valor 0.5
       
        System.out.println("Arreglo B: 10 primeros elementos igual que Arreglo A, ultimos 10 elementos igual a 0.5");
        for (int i = 0; i < 20; i++) {
                arregloB[i] = arregloA[i];
            }
               Arrays.fill(arregloB, arregloB.length-10, arregloB.length, 0.5);
            
        
        imprimirArreglo(arregloB);
    
    }
    
    
    //método para imprimir arreglo
    public static void imprimirArreglo(double arreglo[]){
        System.out.println("***** ARREGLO *****");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println(" ");
    }
}
