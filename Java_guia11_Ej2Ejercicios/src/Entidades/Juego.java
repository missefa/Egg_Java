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
    ArrayList<Jugador> jugadores = new ArrayList();
    RevolverDeAgua r = new RevolverDeAgua();
    
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
        r.llenarRevolver();
    }
    
    public void ronda(){
        boolean mojado = false;
        System.out.println("\n• Nueva_Ronda___________________________");
        for (Jugador j : jugadores) {
           j.disparo(r);
           System.out.println(j);
           if (j.getMojado()){
               mojado = true;
               break;
           }     
        }
        if (!mojado) {
            System.out.println("¡No se mojo nadie! Siguiente ronda >> ");
            ronda();
        } else {
            System.out.println("¡Alguien se fue totalmente mojado!");
            
        }
    } 
}
