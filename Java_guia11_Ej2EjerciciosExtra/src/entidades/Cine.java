/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author JosePc
 */
public class Cine {
    
    private Pelicula pelRep;
    private boolean sala[][] = new boolean[8][6];
    private int precio;

    public Cine() {
    }

    public Cine(Pelicula pelRep, int precio) {
        this.pelRep = pelRep;
        this.precio = precio;
    }

    public Pelicula getPelRep() {
        return pelRep;
    }

    public void setPelRep(Pelicula pelRep) {
        this.pelRep = pelRep;
    }

    public boolean[][] getSala() {
        return sala;
    }

    public void setSala(boolean[][] sala) {
        this.sala = sala;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelRep=" + pelRep + ", sala=" + sala + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
    
    
    
}
