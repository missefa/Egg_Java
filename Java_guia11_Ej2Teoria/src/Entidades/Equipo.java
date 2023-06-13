/*
 EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Entidades;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Equipo {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    private ArrayList<Jugador> jugadores = new ArrayList();


    public Equipo() {
    }
    public void createTeam(){
//        ArrayList<Jugador> boquita = new ArrayList();
        Jugador j = new Jugador();
        for (int i = 0; i < 3; i++) {
        
        System.out.println("nombre");
        j.setName(read.next());
        System.out.println("apellido");
        j.setLastName(read.next());
        System.out.println("numero de jugador");
        j.setNumberPlayer(read.nextInt());
        System.out.println("posicion");
        j.setPosition(read.nextInt());
        jugadores.add(j);
    }

  
    }

    @Override
    public String toString() {
        return "Equipo{" + "read=" + read + ", jugadores=" + jugadores + '}';
    }
    

}
