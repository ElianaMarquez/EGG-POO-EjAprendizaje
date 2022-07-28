
package Entidades;
import java.util.Scanner;

public class Circunferencia {
    
//declaro atributos
private Double radio;
    
//constructor con radio como parámetro

    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

  
//getter y setter

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
  
}


/*
para que el numero no devuelva tantos dígitos:
System.out.println("numero: "+numero+" numero redondeado: "+(((float) Math.round(numero*100))/100));

*/
    

