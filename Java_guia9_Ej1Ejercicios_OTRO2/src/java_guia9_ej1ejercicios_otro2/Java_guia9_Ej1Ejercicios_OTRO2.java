/*
1. Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática...
 */
package java_guia9_ej1ejercicios_otro2;

import java_guia9_ej1ejercicios_otro2.servicios.CadenaServicio;


public class Java_guia9_Ej1Ejercicios_OTRO2 {

    
    public static void main(String[] args) {
       CadenaServicio s = new CadenaServicio();
        s.crearFrase();
        s.invertirFrase();
        s.vecesRepetido();
        s.compararLongitud();
        s.unirFrases();
        s.reemplazar();
        s.contiene();
    }
    
}
