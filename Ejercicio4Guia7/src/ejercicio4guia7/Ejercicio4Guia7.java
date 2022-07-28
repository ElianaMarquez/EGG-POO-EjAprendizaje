package ejercicio4guia7;

import Entidades.Rectangulo;
import Servicios.rectanguloServicio;

public class Ejercicio4Guia7 {

    public static void main(String[] args) {
        rectanguloServicio rs = new rectanguloServicio();
        Rectangulo rect1 = rs.crearRectangulo();

        rs.calSuperficie(rect1);
        rs.calcPerimetro(rect1);
        rs.dibujaRectangulo(rect1);
    }

}
