/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guia7_ej3ejerciciosextra.entidades;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Juego {

    private int cantidadIntentos;
    private int numeroAdivinar;
    private int numeroIngresado;

    public Juego() {
    }

    public Juego(int cantidadIntentos, int numeroAdivinar, int numeroIngresado) {
        this.cantidadIntentos = cantidadIntentos;
        this.numeroAdivinar = numeroAdivinar;
        this.numeroIngresado = numeroIngresado;
    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    public void setCantidadIntentos(int cantidadIntentos) {
        this.cantidadIntentos = cantidadIntentos;
    }

    public void iniciarJuego() {
        boolean respuesta = true;
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingresa la cantidad de intentos para adivinar");
            this.cantidadIntentos = leer.nextInt();
            System.out.println("Jugador 1: Elige el número a adivinar");
            this.numeroAdivinar = leer.nextInt();
            int contador = 0;
            do {
                System.out.println("Jugador 2: Ingrese un número para adivinar");
                this.numeroIngresado = leer.nextInt();
                if (numeroIngresado > numeroAdivinar) {
                    System.out.println("Más bajo");
                } else if (numeroIngresado < numeroAdivinar) {
                    System.out.println("Más alto");
                }
                contador++;
            } while (contador < cantidadIntentos && numeroAdivinar != numeroIngresado);
            if (numeroAdivinar != numeroIngresado) {
                System.out.println("No adivinaste :c");
            } else {
                System.out.println("Adivinaste!!!");
            }
            System.out.println("cantidad de intentos: " + contador++);

            System.out.println("¿Desea continuar el juego?");
            String respu = leer.next();
            if (respu.equalsIgnoreCase("NO")) {
                respuesta = false;
            }
        } while (respuesta);

    }
}
