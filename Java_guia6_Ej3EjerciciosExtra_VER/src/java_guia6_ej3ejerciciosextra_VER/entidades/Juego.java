
package java_guia6_ej3ejerciciosextra.entidades;

import java.util.Scanner;


public class Juego {
    
    private int jugador1;
    private int jugador2;
    private int intentos = 3;

    public Juego() {
    }

    public Juego(int jugador1, int jugador2, int intentos) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.intentos = intentos;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getJugador1() {
        return jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public int getIntentos() {
        return intentos;
    }
    
    public int Jugador1(Juego numeros){
        Scanner read=new Scanner(System.in);
        System.out.println("Jugador 1. Elija un numero");
        numeros.setJugador1(read.nextInt());
        return 0;
    }
    
    public int Jugador2(Juego numeros){
        Scanner read=new Scanner(System.in);
        int i = 0;
        //boolean win = true;
            do{
              System.out.println("Jugador 2. Adivine el numero");
              numeros.setJugador2(read.nextInt());
                if(jugador2==jugador1){
                   System.out.println("JUGADOR 2 ha GANADO");
                   //win=false;
                  break;
               }
                i++;
             }while(i<intentos);//|| win==false
        if(i==intentos){
            System.out.println("JUGADOR 1 ha GANADO");
        }
        System.out.println("Intentos utilizados: " + i);
        return 0;
    }    
        
    
}
