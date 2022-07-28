package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("'n");
    Cadena frase = new Cadena();

    public void mostrarVocales(Cadena frase) {
        int contVocales = 0;

        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getCadena().substring(i, (i + 1)).equalsIgnoreCase("a")
                    || frase.getCadena().substring(i, (i + 1)).equalsIgnoreCase("e")
                    || frase.getCadena().substring(i, (i + 1)).equalsIgnoreCase("i")
                    || frase.getCadena().substring(i, (i + 1)).equalsIgnoreCase("o")
                    || frase.getCadena().substring(i, (i + 1)).equalsIgnoreCase("u")) {
                contVocales++;
            }

        }
        System.out.println("Hay " + contVocales + " vocales en la frase");
        System.out.println("-----------------------");

    }

    public void invertirFrase(Cadena frase) {
        for (int i = frase.getLongitud()-1; i >= 0; i--) {
            System.out.print(frase.getCadena().substring(i, (i + 1)));

        }
        System.out.println("");
        System.out.println("---------------------");
    }

    public void vecesReoetido(Cadena frase, String letra) {
        int contLetra = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getCadena().substring(i, (i + 1)).equalsIgnoreCase(letra)) {
                contLetra++;
            }
        }
        System.out.println("La letra "+ letra+" se repite "+contLetra+ " veces");
        System.out.println("----------------------");
    }

    public void compararLongitud(Cadena frase, String frase2) {
   

        if (frase.getLongitud() < frase2.length()) {
            System.out.println("La frase ingresada es más Larga");
        } else if (frase.getLongitud() > frase2.length()) {
            System.out.println("La frase es más Corta");

        } else {
            System.out.println("Las frases tienen la misma longitud");
        }
        System.out.println("---------------");
    }
    public void unirFrases(Cadena frase, String frase2){
        System.out.println("CADENAS UNIDAS");
        System.out.println(frase.getCadena().concat(frase2));
        System.out.println("-----------------");
      
    }
    public void reemplazar(Cadena frase, String letraReemp){
      
        
        System.out.println(frase.getCadena().replace("a", letraReemp));
        System.out.println("-------------------");
    }
public void contiene(Cadena frase, String letra){
    System.out.println("La frase contiene la letra " + letra + "??");
    System.out.println(frase.getCadena().contains(letra));
    System.out.println("-----------------");
}
    
}
