/*
 EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Entidades;


public class Jugador {
    private String name;
    private String lastName;
    private int position;
    private int numberPlayer;

    public Jugador() {
    }

    public Jugador(String name, String lastName, int position, int numberPlayer) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.numberPlayer = numberPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getNumberPlayer() {
        return numberPlayer;
    }

    public void setNumberPlayer(int numberPlayer) {
        this.numberPlayer = numberPlayer;
    }

    @Override
    public String toString() {
        return "Jugador{" + "name=" + name + ", lastName=" + lastName + ", position=" + position + ", numberPlayer=" + numberPlayer + '}';
    }
    
    
    
}
