/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Alumno {
     private String nombre;
    private ArrayList<Integer> notas;

    public Alumno() {
        notas = new ArrayList();
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return "AlumnoService{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

}
