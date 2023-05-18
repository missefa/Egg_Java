/*
Como el Iterator es parte del framework de colecciones, todas las colecciones vienen con el
método iterator(), este, devuelve las instrucciones para iterar sobre esa colección. Este método
iterator(), devuelve la colección, lo recibe el objeto Iterator y usando el objeto Iterator, podemos
iterar sobre nuestra colección.
Para poder usar el Iterator es importante crear el objeto de tipo Iterator, con el mismo tipo de dato
que nuestra colección.
El Iterator contiene tres métodos muy útiles para lograr esto:
1. boolean hasNext(): Retorna verdadero si al iterator le quedan elementos por iterar
2. Object next(): Devuelve el siguiente elemento en la colección, mientras le método
hasNext() retorne true. Este método es el que nos sirve para mostrar el elemento,
3. void remove(): Elimina el elemento actual de la colección.
 */
package java_guia10_ejemploteoria_iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Erica
 */
public class Java_guia10_EjemploTeoria_Iterator {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList();
        lista.add("A");
        lista.add("B");

        //Creamos el Iterator para recorrer la lista.
        Iterator iterador = lista.iterator(); //Devolvemos el iterador
        System.out.println("Elementos de la lista :");

        //Armamos un bucle while siempre que el hasnext() devuelva true
        while (iterador.hasNext()) { //Mostramos los elementos con el iterator.next()
            System.out.println(iterador.next() + "");
        }
        System.out.println();

        //Como pudimos ver más arriba para eliminar un elemento de una colección vamos a tener que
        //utilizar la función remove() del Iterator. Esto se aplica para el resto de nuestras colecciones. 
        //Los mapas son los únicos que no podemos eliminar mientras las iteramos.
        
        ArrayList<String> palabrasList = new ArrayList();
        palabrasList.add("Hola");
        palabrasList.add("Juana");
        Iterator<String> it = palabrasList.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Juana")) {
                it.remove();
                System.out.println(palabrasList);
            }
        }
        
        HashSet<Integer> numerosSet = new HashSet();
        numerosSet.add(3);
        numerosSet.add(1);
        Iterator<Integer> it2 = numerosSet.iterator();
        while (it2.hasNext()) {
            if (it2.next() == 3) {
                it2.remove();
                System.out.println(numerosSet);
            }
        }

   
    }
}
