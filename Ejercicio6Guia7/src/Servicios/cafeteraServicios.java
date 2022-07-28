
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;


public class cafeteraServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cafetera nuevaCafetera(){
      //instanciar un objeto de tipo cafetera
       Cafetera caf = new Cafetera();
       //lleno los atributos
        System.out.println("Ingrese los datos de la nueva cafetera");
        System.out.println("Capacidad Máxima:");
        caf.setCapacidadMaxima(leer.nextInt());
        System.out.println("Cantidad Actual de Café:");
        caf.setCantidadActual(leer.nextInt());
       return caf;
    }
    
    public void llenarCafetera(Cafetera caf){
      
       caf.setCantidadActual(caf.getCapacidadMaxima());
        System.out.println("La cafetera se lleno correctamente");
    }
    
    public void servirTaza(Cafetera caf, int tamtaza){
        if (caf.getCantidadActual() < tamtaza) {
            System.out.println("La cantidad de café no alcanza para llenar la taza\n La taza se lleno con "+ caf.getCantidadActual());
             caf.setCantidadActual(0);
        }else {
            System.out.println("La taza se llenó con café");
            caf.setCantidadActual(caf.getCantidadActual()-tamtaza);
        }
    }
    public void vaciarCafetera (Cafetera caf){
        caf.setCantidadActual(0);
        System.out.println("La cafetera se vació correctamente");
    }
    public void agregarCafe(Cafetera caf, int cantCafe){
        int x = caf.getCapacidadMaxima()-caf.getCantidadActual();
        if (cantCafe <= x){
            caf.setCantidadActual(caf.getCantidadActual()+cantCafe);
            System.out.println("Se agregó correctamente, la cantidad de cafe actual es: "+ caf.getCantidadActual());
        }else{
            System.out.println("La cantidad a añadir es demasiado, solo se agregarán "+ x +"\nSobran: " + (cantCafe-x));
            caf.setCantidadActual(caf.getCapacidadMaxima());
        }
    }
    
}
