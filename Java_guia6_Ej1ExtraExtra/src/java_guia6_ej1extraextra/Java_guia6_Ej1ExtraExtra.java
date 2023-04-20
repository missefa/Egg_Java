/*
Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla.

 */
package java_guia6_ej1extraextra;

import java_guia6_ej1extraextra.entidades.Coche;


public class Java_guia6_Ej1ExtraExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche1=new Coche();
        coche1.cargarDatos(coche1);
        System.out.println(coche1.toString());
        
        Coche coche2=new Coche();
        coche2.cargarDatos(coche2);
        System.out.println(coche2.toString());
        
        Coche coche3=new Coche();
        coche3.cargarDatos(coche3);
        System.out.println(coche3.toString());
    }
    
}
