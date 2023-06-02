/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package java_guia11_ej1ejercicios;

// https://www.youtube.com/watch?v=XKk5k9OrAUg&ab_channel=TodoCode

import Entidades.Perro;
import Entidades.Persona;

// https://www.youtube.com/watch?v=jUxXwW0txao&list=PLgwlfcqa5h3y5vpitxQyKhiNYq3Y83Sa2&index=8&ab_channel=EggCooperation


public class Java_guia11_Ej1Ejercicios {

    
    public static void main(String[] args) {
    Persona p1 = new Persona();
        Persona p2 = new Persona();
        Perro m1 = new Perro();
        Perro m2 = new Perro();

        // Perro 1
        m1.setNombre("Puppy");
        m1.setRaza("Mixto");
        m1.setEdad(13);
        m1.setContextura("Medio");

        // Persona 1
        p1.setPerro(m1);
        p1.setNombre("Pepe");
        p1.setEdad(45);
        p1.setApellido("Alvarez");
        p1.setDocumento(14673456);

        m2.setNombre("Mia");
        m2.setRaza("Pitbull");
        m2.setEdad(11);
        m2.setContextura("chico");

        p2.setPerro(m2);
        p2.setNombre("Ignacio");
        p2.setEdad(58);
        p2.setApellido("Gonzalez");
        p2.setDocumento(13672345);

        System.out.println(p1.toString());
        System.out.println(p2.toString());       
    }
    
}
