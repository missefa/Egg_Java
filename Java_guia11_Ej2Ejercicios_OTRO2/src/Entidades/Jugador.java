/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JosePc
 */
public class Jugador {

    Scanner leerNum = new Scanner(System.in);

    private Integer id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(RevolverDeAgua r) {
        boolean mojado = false;

        mojado = r.mojar();
        r.siguienteChorro();
        this.mojado = mojado;

        return mojado;
    }

    /* @crearJugadores
     */
    public ArrayList crearJugadores(){
        
        
       ArrayList<Jugador>  jugadores = new ArrayList();
        System.out.println("Ingrese la cantidad de jugadores: ");
        int cant = leerNum.nextInt();

        if (cant < 1 || cant > 7) {
            cant = 6;
        }

        for (int i = 1; i < cant; i++) {

            Jugador j = new Jugador();
            j.setId(i);
            j.setNombre("Jugador " + i);
            j.setMojado(false);
            jugadores.add(j);

        } 
        return jugadores;
    } 
}   





