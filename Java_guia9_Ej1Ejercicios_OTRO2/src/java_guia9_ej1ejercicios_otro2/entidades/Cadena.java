/*
1. Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática...
 */
package java_guia9_ej1ejercicios_otro2.entidades;


public class Cadena {
    
    private String cadena;
    private int longitud;

    public Cadena() {
       this.cadena = "";
        this.longitud = 0; 
    }

    public Cadena(String cadena) {
        this.cadena = cadena;
        this.longitud = cadena.length();
    }
    
    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
    
}
