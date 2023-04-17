/*
Es tu turno, crea tu propio proyecto con la clase Persona.
Seguiremos trabajando sobre la clase Persona que creamos y ahora deberás
sumarle 3 atributos que creas pertinentes.
Volveremos a usar la clase Persona y vamos a crear objetos en tu Main
utilizando los constructores.
Continuaremos con nuestra clase Persona y vamos a primero crear los getter y
setter y después invocarlos desde el Main con alguno de los objetos que
instanciaste.
 */
package java_guia6_ej1teoria;

import java_guia6_ej1teoria.entidades.Persona;

/**
 *
 * @author Erica
 */
public class Java_Guia6_Ej1Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona p1 = new Persona("Alfredo", 12052000, 10000000);

        System.out.println(p1);

        p1.setDni(2222222);

        System.out.println(p1);

    }

}
