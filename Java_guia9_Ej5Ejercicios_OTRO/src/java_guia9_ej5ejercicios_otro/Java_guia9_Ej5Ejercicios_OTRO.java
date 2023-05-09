
package java_guia9_ej5ejercicios_otro;

import java.util.Scanner;
import java_guia9_ej5ejercicios_otro.entidades.Persona;
import java_guia9_ej5ejercicios_otro.servicios.PersonaService;


public class Java_guia9_Ej5Ejercicios_OTRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();
        Scanner leer = new Scanner(System.in);

        System.out.println("Su edad es: " + ps.calcularEdad(p1));

        System.out.print("Ingrese la edad que desea comparar: ");
        int edad = leer.nextInt();

        if (ps.menorQue(p1, edad)) {
            System.out.println(p1.getNombre() + " tiene menor edad que la comparada.");
        } else {
            System.out.println(p1.getNombre() + " tiene mayor edad que la comparada.");
        }

        ps.mostrarPersona(p1);
    }
}
    

