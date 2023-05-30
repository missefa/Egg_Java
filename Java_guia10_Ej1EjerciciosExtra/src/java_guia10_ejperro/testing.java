/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guia10_ejperro;

import Entidades.Pelicula;
import Servicios.PeliculaServicio;

/**
 *
 * @author Usuario
 */
public class testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula p1;
        PeliculaServicio ps = new PeliculaServicio();
        ps.ListaPeliculas();
        ps.mostrarLista();
        ps.mostrarMayor1();
        ps.ordenarAutor();
        ps.ordenarDuracion();
        ps.ordenarTitulo();
        
    }
    
}
