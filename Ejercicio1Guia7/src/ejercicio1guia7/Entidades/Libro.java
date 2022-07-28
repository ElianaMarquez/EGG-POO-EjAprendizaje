
package ejercicio1guia7.Entidades;

import java.util.Scanner;


public class Libro {
      public Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    //atributos
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPag;
    
    //constructor vacio

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
//getter y setter
    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    
    public void cargaLibro(Libro libroN1){
        
        //incerto un objeto de tipo libro
      // Libro libroN1 = new Libro();
       
        
        System.out.println("ingrese el número de ISBN");
        libroN1.setISBN (leer.nextInt());
        System.out.println("Ingrese el título del libro");
        libroN1.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        libroN1.setAutor(leer.next());
        System.out.println("Ingrese el número de páginas del libro");
        libroN1.setNumPag(leer.nextInt());
      
    }

public void imprimeLibro(Libro libroN1){
            System.out.println("Los datos del libro son los siguientes: \n ISBN " +libroN1.getISBN()+ "\n Título: "+libroN1.getTitulo()+ "\n Autor: " + libroN1.getAutor()+ "\n Número de páginas: "+ libroN1.getNumPag());
}    

    @Override
    public String toString() {
        return "Libro{" + "leer=" + leer + ", ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + '}';
    }
}
