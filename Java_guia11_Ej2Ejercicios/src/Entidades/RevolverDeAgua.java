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


public class RevolverDeAgua {
     private double posActual;
    private double posAgua;
    
    public void llenarRevolver(){
        Random random = new Random();
        this.posActual = random.nextInt(6)+1;
        this.posAgua = random.nextInt(6)+1;
    }
    
    public boolean mojar(){
        boolean aux = false;
        if (posActual == posAgua){
            aux = true;
        }
        return aux;
    }
    
    public void siguienteChorro(){
        if (posActual == 6){
            posActual = 1;
        }else{
            posActual ++;
        }
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }  
}
