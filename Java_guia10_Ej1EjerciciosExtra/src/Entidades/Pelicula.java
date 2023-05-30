/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/
/**
 *
 * @author Usuario
 */
public class Pelicula {
    private String titulo;
    private String Autor;
    private double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String Autor, double duracion) {
        this.titulo = titulo;
        this.Autor = Autor;
        this.duracion = duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public Double getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", Autor=" + Autor + ", duracion=" + duracion + '}';
    }
    
    public static Comparator<Pelicula> compararduracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

          return t.getDuracion().compareTo(t1.getDuracion());
        }
        
    };
        
    public static Comparator<Pelicula> comparartitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

          return t.getTitulo().compareTo(t1.getTitulo());
        }
        
    };
    
    public static Comparator<Pelicula> compararautorr = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

          return t.getAutor().compareTo(t1.getAutor());
        }
        
    };
   
        
    
   
    
    
    
}
