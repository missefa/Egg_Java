/*
/** 
 * EJERCICIO COLECCIONES 2B
 *  Recorrer una colección con for each.
 * 
 */
package java_guia10_ejemploteoria_foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Erica
 */
public class Java_guia10_EjemploTeoria_forEach {

   
    public static void main(String[] args) {
        //LISTAS:
        ArrayList<String> list = new ArrayList();
        String x = "¿";
        String x2 = "Hay";
        String x3 = "alguien";
        String x4 = "ahí";
        String x5 = "?";

        list.add(x); //Agregamos un primer elemento al ArrayList
        list.add(x2); //Agregamos un segundo elemento al ArrayList
        list.add(x3); //Agregamos un tercer elemento al ArrayList
        list.add(x4); //Agregamos un cuarto elemento al ArrayList
        list.add(x5); //Agregamos un quinto elemento al ArrayList
        
        list.forEach((cadena) -> {
            System.out.println(cadena);
        }); //Mostramos los elementos con forEach recorriendo la lista 

        System.out.println("----------------");

        //CONJUNTOS (SETS):
        HashSet<Integer> conjunto = new HashSet();
        Integer y = 13;
        Integer y2 = 11;
        Integer y3 = 3;
        Integer y4 = 7;
        Integer y5 = 19;

        conjunto.add(y);
        conjunto.add(y2);
        conjunto.add(y3);
        conjunto.add(y4);
        conjunto.add(y5);
        
        conjunto.forEach((numeros) -> {
            System.out.println(numeros);
        }); //Mostramos los elementos con forEach recorriendo el Set (conjunto)

        System.out.println("----------------");
        
        //MAPAS:
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 34576189;
        String nombreAlumno = "Pepe";
        int dni2 = 34576181;
        String nombreAlumno2 = "Pepe";
        int dni3 = 34576182;
        String nombreAlumno3 = "Pepe";
        int dni4 = 34576183;
        String nombreAlumno4 = "Pepe";
        int dni5 = 34576185;
        String nombreAlumno5 = "Pepe";
        alumnos.put(dni, nombreAlumno); //Agregamos la llave y el valor
        alumnos.put(dni2, nombreAlumno2); //Agregamos la llave y el valor
        alumnos.put(dni3, nombreAlumno3); //Agregamos la llave y el valor
        alumnos.put(dni4, nombreAlumno4); //Agregamos la llave y el valor
        alumnos.put(dni5, nombreAlumno5); //Agregamos la llave y el valor

        alumnos.entrySet().forEach((entry) -> {
            System.out.println("DNI: " + entry.getKey() + ", Nombre: " + entry.getValue());
        }); //Mostramos los elementos con forEach y con Map.Entry para recorrer el mapa

        System.out.println(". . . . . . . . .");

        alumnos.keySet().forEach((documento) -> {
            System.out.println("DNI: " + documento);
        }); //Mostramos las llaves con forEach y sin Map.Entry para recorrer el mapa
        
         alumnos.values().forEach((nombre) -> {
            System.out.println("Nombre: " + nombre);
        }); //Mostramos los valores con forEach y sin Map.Entry para recorrer el mapa

        System.out.println("----------------");
        
       

    }
    
}
