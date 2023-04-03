/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_EjerciciosExtra;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Erica
 */
public class Ej5_guia3EjerciciosExtra_otro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese al monto del servicio");
        float service = leer.nextFloat();
        System.out.println("Ingrese la clase del socio( A,E,C)");

        String Clase = leer.next();
        while (Clase.length() != 1 && !Clase.toLowerCase().equals("a") && !Clase.toLowerCase().equals("b") && !Clase.toLowerCase().equals("c")) {
            System.out.println("La clase escogida no existe, las opciones son A, B o C");
            Clase = leer.next();
        }
        switch (Clase.toLowerCase()) {
            case "a":
                System.out.println("el valor a pagar por el servicio de " + service + " con el descuento del 50% queda en " + service * 0.5);
                break;
            case "b":
                System.out.println("el valor a pagar por el servicio de " + service + " con el descuento del 35% queda en " + service * (1 - 0.35));
                break;
            default:
                System.out.println("el valor a pagar por el servicio de " + service + " con el descuento del 0% queda en " + service);
        }
    }
}


    
    

