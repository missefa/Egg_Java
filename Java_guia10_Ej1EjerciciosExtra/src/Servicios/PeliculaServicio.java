/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/*
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
public class PeliculaServicio {

    private ArrayList<Pelicula> peliculas = new ArrayList();

    public Pelicula crearPelicula() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Pelicula a = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula");
        a.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del autor de la pelicula");
        a.setAutor(leer.next());
        System.out.println("Ingrese la duracion de la pelicula (en minutos)");
        double dur = leer.nextDouble();
        while (dur < 30) {
            System.out.println("La pelicula debe durar mas de 30 minutos, sino es un corto");
            dur = leer.nextDouble();
        }
        a.setDuracion(dur / 60);
        return a;
    }

    public void ListaPeliculas() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String c;
        while (true) {
            Pelicula a = crearPelicula();
            peliculas.add(a);
            System.out.println("Desea crar otra pelicula?");
            c = leer.next();
            while (!c.equalsIgnoreCase("s") && !c.equalsIgnoreCase("n")) {
                System.out.println("La respuesta es incorrecta, debe ingresar S/N");
                c = leer.next();
            }
            if (c.equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    public void mostrarLista() {
        for (Pelicula a : peliculas) {
            System.out.print(a + ", ");
        }
        System.out.println("");
    }

    public void mostrarMayor1() {
        for (Pelicula a : peliculas) {
            if (a.getDuracion() > 1) {
                System.out.print(a + ", ");
            }
        }
        System.out.println("");
    }

    public void ordenarDuracion() {
        peliculas.sort(Pelicula.compararduracion);
        for (Pelicula a : peliculas) {
            System.out.print(a + ", ");
        }
        System.out.println("");
    }

    public void ordenarAutor() {
        peliculas.sort(Pelicula.compararautorr);
        for (Pelicula a : peliculas) {
            System.out.print(a + ", ");
        }
        System.out.println("");
    }

    public void ordenarTitulo() {
        peliculas.sort(Pelicula.comparartitulo);
        for (Pelicula a : peliculas) {
            System.out.print(a + ", ");
        }
        System.out.println("");
    }

}
