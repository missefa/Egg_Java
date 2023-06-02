/*
 Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Entidades;

import java.util.Random;


public class Revolver {
    private int pos_actual;
    private int pos_agua;

    public Revolver() {
    }

    public Revolver(int pos_actual, int pos_agua) {
        this.pos_actual = pos_actual;
        this.pos_agua = pos_agua;
    }

    public int getPos_actual() {
        return pos_actual;
    }

    public void setPos_actual(int pos_actual) {
        this.pos_actual = pos_actual;
    }

    public int getPos_agua() {
        return pos_agua;
    }

    public void setPos_agua(int pos_agua) {
        this.pos_agua = pos_agua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "pos_actual=" + pos_actual + ", pos_agua=" + pos_agua + '}';
    }
       
    // llenarRevolver(): le pone los valores de posición actual y de posición del agua. 
    // Los valores deben ser aleatorios.
            
    public void llenarRevolver() {
        Random r1 = new Random();
       
        this.pos_actual = r1.nextInt(5);  // 6 posiciones en el tambor 0-5
        this.pos_agua   = r1.nextInt(5);  // 
     }
    
    // mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar() {
        // return this.pos_actual == this.pos_agua?true:false;
        
        if (this.pos_actual == this.pos_agua)
            return true;
        else 
            return false;
    }
    
    // siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro() {
        this.pos_actual = (this.pos_actual+1)%6;
    }
   
}