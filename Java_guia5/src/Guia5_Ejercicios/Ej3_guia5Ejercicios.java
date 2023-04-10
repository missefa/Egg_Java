/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia5_Ejercicios;

import java.util.Random;

/**
 *
 * @author Erica
 */
public class Ej3_guia5Ejercicios {
    
 public static void main (String [] args){
       /*
        Recorrer un vector de N enteros contabilizando cuántos números 
        son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        
        Random dado = new Random();
        //dimension del array
        int N = 6;
        //array de enteros
        int[] numeros = new int[N];
        //contador de numeros de una cifra
        int cifra1= 0;
        //contador de numeros de dos cifras
        int cifra2=0;
        //contador de numeros de tres cifra
        int cifra3= 0;
        //contador de numeros de cuatro cifras
        int cifra4=0;
        //contador de numeros de cinco cifras
        int cifra5=0;
        //contador de cifras 
        int contador;
        //copia del numero a analizar
        int rep;
        //bucle donde se va a generar el numero aleatorio y se van a contar las cifras por cada numero
        for(int i =0 ; i<N; i++){
            contador=1;
            //se genera el numero aleatorio
            numeros[i]= dado.nextInt(10000);
            //generamos la copia del numero 
            rep=numeros[i];
            //contamos las cifras
            while(rep>10){
                //cuando dividamos esto va a quedar siempre entero pq lo trunca por ser int
                rep=rep/10;
                //con esto contamos las cifras
                contador++;
            }
            switch(contador){
                case 1:
                    cifra1++;
                    break;
                case 2:
                    cifra2++;
                    break;
                case 3:
                    cifra3++;
                    break;
                case 4:
                    cifra4++;
                    break;
                case 5:
                    cifra5++;
                    break;    
            }
            System.out.println(" [ "+numeros[i]+" ]");
            
        }
        System.out.println("la cantidad de numeros con una cifra son: "+cifra1);
        System.out.println("la cantidad de numeros con dos cifras son: "+cifra2);
        System.out.println("la cantidad de numeros con tres cifras son: "+cifra3);
        System.out.println("la cantidad de numeros con cuatro cifras son: "+cifra4);
        System.out.println("la cantidad de numeros con cinco cifras son: "+cifra5);
        
        
    }
    
}
 
         

