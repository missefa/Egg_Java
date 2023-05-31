/*
EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package javaguia11ej2teoria;

import Entidades.Equipo;


public class Javaguia11Ej2Teoria {

    public static void main(String[] args) {
        Equipo t = new Equipo();
        t.createTeam();
        System.out.println(t);
}
}