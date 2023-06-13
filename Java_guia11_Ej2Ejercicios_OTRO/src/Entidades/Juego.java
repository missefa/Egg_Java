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
    ArrayList <Jugador> jugadores;
    Revolver rev;      

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver rev) {
        this.jugadores = jugadores;
        this.rev = rev;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRev() {
        return rev;
    }

    public void setRev(Revolver rev) {
        this.rev = rev;
    }

    

    public void ronda() {
        boolean mojo;
        System.out.println("Juego en proceso");
        System.out.println("------------------------");

        for (Jugador jugador1 : jugadores) {
            System.out.println("ID Jugador: " + jugador1.getId());
            System.out.println("Jugador: " + jugador1.getNombre());

            mojo = jugador1.disparo(rev);

            if (mojo) {
                System.out.println("EL jugador está mojado y fuera de juego");
                System.out.println("------------------------------------------------------");
                break;
            }
        }

    }
    
    
    public void llenarJuego(){
        Scanner scr = new Scanner(System.in);
        
        System.out.print("__________Ruleta Rusa (de agua)__________"+"\nIngrese cantidad de jugadores (Max = 6) > ");
        int cantJugadores = scr.nextInt();    
       
        
        for (int i = 1; i <= cantJugadores ; i++) {
            Jugador n = new Jugador(i);
            System.out.print("Ingrese nombre del jugador > ");
            n.setNombre(scr.next());
            jugadores.add(n);
        }
        rev.llenarRevolver();
        
    }
    

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", rev=" + rev + '}';
    }
    
}
