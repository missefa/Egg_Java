/*
 */
package java_guia7_ej1ejercicios.entidades;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Libro {
    
    private static int isbn;
    private static String titulo;
    private static String autor;
    private static int paginas;

    public Libro(int isbn, String titulo, String autor, int paginas) {
        Libro.isbn = isbn;
        Libro.titulo = titulo;
        Libro.autor = autor;
        Libro.paginas = paginas;
    }
  
    public Libro (){
        
    }
    
    public static void cargarLibro (Libro book){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar ISBN");
        isbn = leer.nextInt();
        System.out.println("Ingresar el título del libro");
        titulo = leer.next();
        System.out.println("Ingresar nombre y apellido del autor");
        autor = leer.next();
        System.out.println("Ingresar cantidad de páginas del libro");
        paginas = leer.nextInt();
    }
    
    public static void mostrarLibro (Libro book) {
        
        System.out.println("El ISBN del libro es: " +isbn);
        System.out.println("El título del libro es: " +titulo);
        System.out.println("El autor del libro es: " +autor);
        System.out.println("El libro tiene " +paginas+ " páginas");
    }
    
}
