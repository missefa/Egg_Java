/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    Scanner leerNum = new Scanner(System.in);

    private ArrayList<Jugador> jugador;
    private RevolverDeAgua revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugador, RevolverDeAgua revolver) {
        this.jugador = jugador;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    public Juego llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {

      
    Juego jueg = new Juego();

    jueg.setRevolver (r);

    jueg.setJugador (jugadores);

return jueg;

}

public void ronda(){
        boolean mojo;
        System.out.println("Juego en proceso");
        System.out.println("------------------------");
        
        
        for (Jugador jugador1 : jugador) {
            System.out.println("ID Jugador: " + jugador1.getId());
            System.out.println("Jugador: " + jugador1.getNombre());
                       
           mojo = jugador1.disparo(revolver);
           
           if (mojo) {
               System.out.println("EL jugador está mojado y fuera de juego");
               System.out.println("------------------------------------------------------");
                 break;
           }
           
           
         
           
        }
            
        }
        
        
    }
