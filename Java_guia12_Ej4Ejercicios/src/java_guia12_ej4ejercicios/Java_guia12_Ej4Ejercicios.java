/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package java_guia12_ej4ejercicios;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;


/**
 *
 * @author Erica
 */
public class Java_guia12_Ej4Ejercicios {
 
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio del círculo");
        Circulo circ = new Circulo(read.nextDouble());
        System.out.println("Ingrese la base y la altura del rectángulo");
        Rectangulo rect = new Rectangulo(read.nextInt(), read.nextInt());
        
        System.out.println("El cálculo del área del Círculo es: " + circ.calculoArea());
        System.out.println("El cálculo del perímetro del Círculo es: " + circ.calculoPerimetro());
        System.out.println("El cálculo del área del Rectángulo es: " + rect.calculoArea());
        System.out.println("El cálculo del perímetro del Rectángulo es: " + rect.calculoPerimetro());

            
        }
        
}
