/*
/*Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
empleado en función de su edad y salario actual. 
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del
5% si tiene menos de 30 años.
 */
package java_guia7_ej5extra_otro;

import java_guia7_ej5extra_otro.entidades.Empleado;

/**
 *
 * @author Erica
 */
public class Java_guia7_Ej5Extra_OTRO {

    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.cargarDatos(empleado);
        
    }
}
