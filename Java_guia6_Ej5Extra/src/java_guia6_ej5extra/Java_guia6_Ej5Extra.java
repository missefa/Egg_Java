/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package java_guia6_ej5extra;

import java_guia6_ej5extra.entidades.Empleado;

/**
 *
 * @author Erica
 */
public class Java_guia6_Ej5Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner read = new Scanner(System.in);
        Empleado trabajador = new  Empleado();
        
        trabajador.cargarDatos(trabajador);
        //trabajador.calcularAumento(trabajador);
        System.out.println("---------------------------------------------");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Salario base: " + trabajador.getSalario());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Su Salario total es: " + trabajador.calcularAumento(trabajador));
    }
    
}
