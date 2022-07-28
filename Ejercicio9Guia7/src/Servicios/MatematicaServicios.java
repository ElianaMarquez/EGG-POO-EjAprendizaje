
package Servicios;

import Entidades.Matematica;


public class MatematicaServicios {

    public void devolverMayor(Matematica objet){
        System.out.println("El mayor de los números es "+ Math.max(objet.getNum1(), objet.getNum2()));
    }
    public void calcularPotencia(Matematica objet){
        long numRed1 = Math.round(objet.getNum1());
        long numRed2 = Math.round(objet.getNum2());
        if (numRed1<numRed2){
            System.out.println(numRed2 + " elevado a la "+numRed1+" potencia es: "+Math.pow(objet.getNum2(), objet.getNum1()));
        } else {
             System.out.println(numRed1 + " elevado a la "+numRed2+" potencia es: "+Math.pow(objet.getNum1(), objet.getNum2())); 
        }
    }
    public void calculaRaiz(Matematica objet){
        System.out.println("La raiz cuadrada del número menor es: "+ Math.sqrt(Math.abs(Math.min(objet.getNum1(), objet.getNum2()))));
    }
    
}
