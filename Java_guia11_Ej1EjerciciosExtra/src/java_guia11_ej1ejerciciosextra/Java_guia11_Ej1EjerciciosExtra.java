/*
1. Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package java_guia11_ej1ejerciciosextra;

import Entidades.Perro;
import Servicios.ServiciosEntidades;


public class Java_guia11_Ej1EjerciciosExtra {

    
    public static void main(String[] args) {
          
        Perro perro1 = new Perro();
        ServiciosEntidades se1 = new ServiciosEntidades();

        se1.crearPerro(perro1);
        se1.datosPersona();
        se1.mostrar();
    
    }
    
}
