package java_guia11_ej2ejercicios_otro2;

import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverDeAgua;
import java.util.ArrayList;

public class Java_guia11_Ej2Ejercicios_OTRO2 {

    public static void main(String[] args) {
        boolean resultado;

        Juego j = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList();
        Jugador jj = new Jugador();

        RevolverDeAgua r = new RevolverDeAgua();

        r.llenarRevolver();

        jugadores = jj.crearJugadores();

       j= j.llenarJuego(jugadores, r);

       
       
        j.ronda();
        
        // System.out.println(j.getJugador());

    }

}
