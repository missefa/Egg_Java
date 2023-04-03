/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Erica
 */


public class Ej1_guiaEjerciciosExtra_otro_VER {
    
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        //inicializamos nuestras 4 variables
        System.out.println("ingrese un tiempo en minutos");
        int mins = leer.nextInt();
        int hs = 0;
        int ds = 0;
        int min = 0;
        //Caluculamos las horas
        hs = (mins - (mins % 60)) / 60;
        //guardamos en una variable aquellos minutos que no llegan a ser una hora
        min = mins - hs * 60;
        //calculamos los dias de la misma manera que calculamos horas pero usando de referencia las horas
        ds = (hs - (hs % 24)) / 24;
        // Eliminamos de la variable hs aquellas horas que ahora son días
        hs -= ds * 24;
        //mostramos el resultado
        System.out.println("El tiempo ingresado, " + mins + " minutos, corresponde a " + ds + " días, " + hs + " horas y " + min + " minutos");
    }

}
