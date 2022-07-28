
package ejercicio1guia7;
import ejercicio1guia7.Entidades.Libro;

public class Ejercicio1Guia7 {

   
    public static void main(String[] args) {
        
      Libro libro1 = new Libro(); 
      libro1.cargaLibro(libro1);
  
      libro1.imprimeLibro(libro1);
        
    }
    
}
