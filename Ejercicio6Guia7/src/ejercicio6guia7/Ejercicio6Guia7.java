package ejercicio6guia7;

import Entidades.Cafetera;
import Servicios.cafeteraServicios;
import java.util.Scanner;

public class Ejercicio6Guia7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        cafeteraServicios cs = new cafeteraServicios();
        Cafetera caf1 = cs.nuevaCafetera();
        int op;
        do {
            System.out.println("");
            System.out.println("----- SERVICIO NESPRESSO - Seleccione una opción -----");
            System.out.println("1. Llenar Cafetera \n2. Servir Taza \n3. Vaciar Cafetera \n4. Agregar Café \n5. Informe \n6. Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    cs.llenarCafetera(caf1);
                    break;
                case 2:
                    System.out.println("Cuál es el tamaño de la taza?");
                    int taza = leer.nextInt();
                    cs.servirTaza(caf1, taza);
                    break;
                case 3:
                    cs.vaciarCafetera(caf1);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de café que desea agregar:");
                    int cant = leer.nextInt();
                    cs.agregarCafe(caf1, cant);
                    break;
                case 5:
                    System.out.println(caf1);
                    break;
            }
            System.out.println("");
        } while (op != 6);

    }

}
