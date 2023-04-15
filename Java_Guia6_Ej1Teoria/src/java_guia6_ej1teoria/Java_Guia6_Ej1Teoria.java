/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
