/*
 Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */

package Guia4_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej3_guia4Ejercicios {
   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingresa cantidad de euros:");
        double euro = read.nextDouble();
        cambio (euro);
    }

    public static void cambio(double euro) {
        Scanner read = new Scanner(System.in);
        System.out.println("elija una opcion");
        String opcion = read.next();
        //double libra;
        //double dolar;
        //double yenes;
        switch (opcion.toLowerCase()) {
            case "libra":
                double aux = euro * 0.86;
                System.out.println("pasado a libras es: " + aux);
                break;
            case "dolar":
                aux = euro * 1.28611;
                System.out.println("pasado a dolar es: " + aux);
                break;
            case "yenes":
                aux = euro * 129.852;
                System.out.println("pasado a yenes es: " + aux);
                break;
        }
    }
}

