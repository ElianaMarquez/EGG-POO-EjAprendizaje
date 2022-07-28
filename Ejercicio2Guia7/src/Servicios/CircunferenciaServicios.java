
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;


public class CircunferenciaServicios {
  
      //metodo para crear circunferencia, que le pide el radio y lo guarda en el atributo objeto
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Circunferencia c1 = new Circunferencia();
        
        System.out.println("Ingrese el radio de la circunferencia");
        c1.setRadio(leer.nextDouble());
        
        return c1;
    }
    
    public void calculaArea(Circunferencia c1){
        double area = Math.PI * Math.pow(c1.getRadio(), 2);
        
        System.out.println("El área de la circunferencia es: " + area);
    }
    public void calculaPerimetro(Circunferencia c1){
        double perimetro = 2 * Math.PI * c1.getRadio();
        
        System.out.println("El Perímetro de la circunferencia es: " + perimetro);
        
    }
    
}
