/*
Los elementos, que vamos agregando a nuestra colección se van a mostrar según se fueron
agregando y nosotros capaz, necesitemos mostrar o tener todos los elementos ordenados.
Para ordenar una colección, vamos a tener que utilizar la función Collections.sort(colección). La
función, que es parte de la clase Collections, recibe la colección y la ordena para después poder
mostrarla ordenada de manera ascendente.
12
Algunas colecciones, como los conjuntos o los mapas no pueden utilizar el sort(). Ya que por
ejemplo los HashSet, manejan valores Hash y el sort() no sabe ordenar por hash, si no por
elementos. Por otro lado, los mapas al tener dos datos, el sort() no sabe por cuál de esos datos
ordenar.
Entonces, para ordenar los conjuntos, deberemos convertirlos a listas, para poder ordenar esa
lista por sus elementos. Y a la hora de ordenar un mapa como tenemos dos datos para ordenar,
vamos a convertir el HashMap a un TreeMap.
Nota: recordemos que los TreeSet y TreeMap se ordenan por sí mismos.
 */
package java_guia10_ejemploteoria_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;


public class Java_guia10_EjemploTeoria_sort {

  
    public static void main(String[] args) {
     
        //LISTAS:
        ArrayList<Integer> numeros = new ArrayList();

        Integer n1 = 4;
        Integer n2 = 10;
        Integer n3 = 2;
        
        //Agregamos tres elementos al ArrayList
        numeros.add(n1); 
        numeros.add(n2);
        numeros.add(n3);
        
        //Ordenamos los elementos de la lista con sort
        Collections.sort(numeros); 

        //Mostramos los elementos con forEach recorriendo la lista 
        numeros.forEach((lista) -> {
            System.out.println(lista);}); 

        System.out.println("----------------");
       
        //CONJUNTOS (SET):
        HashSet<Integer> numerosSet = new HashSet();
        
        //Convertimos el set en list
        ArrayList<Integer> numerosLista = new ArrayList(); 
        
        //Agregamos tres elementos al ArrayList
        numerosLista.add(30); 
        numerosLista.add(20);
        numerosLista.add(40);
        
        //Ordenamos los elementos de la lista con sort
        Collections.sort(numerosLista);
        
        //Mostramos los elementos con forEach recorriendo la lista
        numerosLista.forEach((listaSet) -> {
            System.out.println(listaSet);});  
        
       System.out.println("----------------");
       
        //MAPS:
        HashMap<Integer, String> alumnos = new HashMap();
        
       //Agregamos la llave y el valor de los elementos del mapa
        alumnos.put(12, "Roque"); 
        alumnos.put(10, "Diana");
        alumnos.put(11, "Leslie");
        
        //(VER)Convertimos el HashMap a TreeMap
        //TreeMap<Integer, String> alumnosTree = new TreeMap();
        
        //Mostramos los elementos con forEach y con Map.Entry para recorrer el mapa
        alumnos.entrySet().forEach((entry) -> {
            System.out.println("Número de alumno: " + entry.getKey() + ", Nombre: " + entry.getValue());
        }); 
        
        System.out.println();      
    }
    
}
