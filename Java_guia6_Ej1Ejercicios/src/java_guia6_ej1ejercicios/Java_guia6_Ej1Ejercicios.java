/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
package java_guia6_ej1ejercicios;


import java_guia6_ej1ejercicios.entidades.Libro;

/**
 *
 * @author Erica
 */
public class Java_guia6_Ej1Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Libro book = new Libro();

        Libro.cargarLibro(book);
        
        Libro.mostrarLibro(book);
    }
}
