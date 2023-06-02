/*
 Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package Entidades;


public class Jugador {
    
    private final int id; //este es el n del jugador
    private String nombre;
    private boolean mojado = false;

    public Jugador(int id) {
        this.id = id;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    public void disparo(RevolverDeAgua r){                
        if (r.mojar()){
            mojado = true;
        }else{
            r.siguienteChorro();
        }
    }

    @Override
    public String toString() {
        return "Jugador{" + "" + nombre + " " + id +", mojado = " + mojado + '}';
    } 

    public boolean getMojado() {
        return mojado;
    }
}
