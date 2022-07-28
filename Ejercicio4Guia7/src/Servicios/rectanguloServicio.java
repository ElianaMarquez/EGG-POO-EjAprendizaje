package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class rectanguloServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Rectangulo rect = new Rectangulo();

    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese la medida de la base del renctángulo");
        rect.setBase(leer.nextDouble());
        System.out.println("Ingrese lamedida de la altura del rectángulo");
        rect.setAltura(leer.nextDouble());
        return rect;
    }

    public void calSuperficie(Rectangulo rect) {
        double sup = rect.getBase() * rect.getAltura();
        System.out.println("La superficie del Rectángulo es: " + sup);
    }

    public void calcPerimetro(Rectangulo rect) {
        double perim = (rect.getBase() + rect.getAltura()) * 2;
        System.out.println("El Perímetro del Rectángulo es: " + perim);
    }

    public void dibujaRectangulo(Rectangulo rect) {
        for (int i = 0; i < rect.getAltura(); i++) {
            for (int j = 0; j < rect.getBase(); j++) {
                if (i == 0 || i == (rect.getAltura() - 1) || j == 0 || j == (rect.getBase() - 1)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

}
