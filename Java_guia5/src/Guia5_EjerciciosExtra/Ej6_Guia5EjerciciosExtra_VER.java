/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
package Guia5_EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class Ej6_Guia5EjerciciosExtra_VER {

    public static void main(String[] args) {

        System.out.println("ingrese 5 palabras");
        Scanner leer;
        leer = new Scanner(System.in);
        String[] palabra = new String[5];
        String[][] sopa = new String[20][20];
        for (int i = 0; i < 5; i++) {
            while (palabra[i].length() < 3 || palabra[i].length() > 5) {
                System.out.println("debe ingresar entre 3 y 5 caracteres ");
                palabra[i] = leer.nextLine();
            }
        }

    }
}
