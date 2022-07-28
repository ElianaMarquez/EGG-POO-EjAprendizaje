package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicios {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona pers = new Persona();
        System.out.println("Complete el siguiente cuestionario:");
        System.out.println("Nombre:");
        pers.setNombre(leer.next());
        System.out.println("Edad:");
        pers.setEdad(leer.nextInt());
        System.out.println("Sexo ( H - Hombre, M - Mujer, O - Otro");
        pers.setSexo(leer.next().charAt(0));
       
           do {
                if (pers.getSexo() != 'H' && pers.getSexo() != 'M' && pers.getSexo() != 'O') {
                System.out.println("Sólo puede ingresar H, M, O.\n Ingrese nuevamente por favor");
                pers.setSexo(leer.next().charAt(0));
                }
          } while (pers.getSexo() != 'H' && pers.getSexo() != 'M' && pers.getSexo() != 'O');
     
        
        System.out.println("Peso:");
        pers.setPeso(leer.nextInt());
        System.out.println("Altura:");
        pers.setAltura(leer.nextDouble());

        return pers;
    }
    public void calcularIMC(Persona pers){
        double pesoIdeal = pers.getPeso()/ Math.pow(pers.getAltura(),2);
        if (pesoIdeal < 20){
            System.out.println("-1  *** "+ pers.getNombre()+" está por debajo de su pero ideal");
        }else{
            if (pesoIdeal >= 20 && pesoIdeal <= 25){
                System.out.println(" 0  *** " + pers.getNombre() + " está en su peso ideal");
            }else {
                System.out.println(" 1   *** " + pers.getNombre()+ " tiene sobrepeso");
            }
        }
    }
    public void esMayorDeEdad(Persona pers){
        System.out.println(pers.getNombre() + " es mayor de edad?");
        boolean mayEdad = (pers.getEdad()>18);
        System.out.println(mayEdad);
    }
}
