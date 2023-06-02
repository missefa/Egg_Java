/*
 Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Entidades;


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

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {

      
    Juego jueg = new Juego();

    jueg.setRevolver (r);

    jueg.setJugador (jugadores);


}

public void ronda(){
        boolean mojo;
        
        for (Jugador jugador1 : jugador) {
            
           mojo = jugador1.disparo(revolver);
           
           break;
           
        }
            
        }
        
        
    }
