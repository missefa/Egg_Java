/*
EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package java_guia11_ej2teoria;

import Entidades.Equipo;


public class Java_guia11_Ej2Teoria {

    public static void main(String[] args) {
        Equipo t = new Equipo();
        t.createTeam();
        System.out.println(t);
}
}