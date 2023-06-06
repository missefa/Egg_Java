
package java_guia11_ej3ejercicios;

import Entidades.Carta;
import Servicios.Baraja;
import java.util.ArrayList;


public class Java_guia11_Ej3Ejercicios {

    public static void main(String[] args) {
        realizarJuego();
    }

    private static void realizarJuego() {
        Baraja baraja = new Baraja();
        System.out.println("Barajando las cartas...");
        baraja.barajar();

        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());

        System.out.println("Mostrando la baraja: ");
        baraja.mostrarBaraja();

        System.out.println("Siguiente carta: " + baraja.siguienteCarta());

        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());

        System.out.println("Repartiendo 5 cartas: ");

        ArrayList<Carta> cartasRepartidas = baraja.darCartas(5);
        if (cartasRepartidas != null) {
            for (Carta carta : cartasRepartidas) {
                System.out.println("Carta: " + carta);
            }

        }
        System.out.println("Cartas disponibles");
    }
}
