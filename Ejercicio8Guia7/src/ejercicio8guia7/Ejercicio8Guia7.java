package ejercicio8guia7;

import Entidades.Cadena;
import Servicios.CadenaServicios;
import java.util.Scanner;

public class Ejercicio8Guia7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena frase1 = new Cadena();
        CadenaServicios cs = new CadenaServicios();

        System.out.println("Ingrese una palabra o varias palabras separadas por un espacio en blanco ");
        frase1.setCadena(leer.nextLine());
        frase1.setLongitud(frase1.getCadena().length());

        cs.mostrarVocales(frase1);
        cs.invertirFrase(frase1);
        System.out.println("Ingrese el caracter paar ver cuantas veces se repite");
        String letra = leer.next();
        cs.vecesReoetido(frase1, letra);
        System.out.println("Ingrese otra frase para comparar");
        String otraFrase = leer.next();
        cs.compararLongitud(frase1, otraFrase);
        cs.unirFrases(frase1, otraFrase);
        System.out.println("Ingrese el caracter que reemplazará a las letras A contenidas en la frase ");
        String caracter = leer.next();
        cs.reemplazar(frase1, caracter);
        System.out.println("Ingrese un caracter para ver si lo contiene la frase ");
        String otroCaracter = leer.next();
        cs.contiene(frase1, otroCaracter);

    }

}
