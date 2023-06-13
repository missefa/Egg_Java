/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author JosePc
 */
public class Espectador {

    private String nombre;
    private int edad;
    private int dinero;
    private boolean sentado;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, int dinero, boolean sentado) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.sentado = sentado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public boolean isSentado() {
        return sentado;
    }

    public void setSentado(boolean sentado) {
        this.sentado = sentado;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", sentado=" + sentado + '}';
    }

    public ArrayList creaEspectadores(ArrayList listaEspectadores) {

        for (int i = 0; i < 51; i++) {
            Espectador esp = new Espectador();
            esp.nombre = ("Espectador " + i);
            esp.edad = (int) (Math.random() * 50);
            esp.dinero = (int) ((Math.random() * 1000) + 100);

            listaEspectadores.add(esp);

        }

        return listaEspectadores;

    }

}
