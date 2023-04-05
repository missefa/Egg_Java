/*
 Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 */
package Guia4_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej4_guia4Ejercicios {
    
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        boolean esPrimo = false;
        int num= read.nextInt();
        numPrimo(num);
    }
    
    public static void numPrimo(int num){
        boolean esPrimo;
        int primo;
         esPrimo = false;
        if (num!=2 && num%2 ==0 ){
             esPrimo= false;
        }else if(num!=3 && num%3==0){
            esPrimo= false;
              }else if (num!=5 && num%5==0){
                  esPrimo= false;
               }else {
                   esPrimo= true;
                  
                   }
         System.out.println(esPrimo);
    }
}

