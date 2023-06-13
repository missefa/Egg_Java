/*
EJERCICIO ANIMAL
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */
package java_guia12_ej1teoria;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author Erica
 */
public class Java_guia12_Ej1Teoria {

    
    public static void main(String[] args) {
       
       ArrayList<Animal> mascotas = new ArrayList();
       Animal a = new Animal();
       Animal b = new Perro();
       Animal c = new Gato();
       
       mascotas.add(a);
       mascotas.add(b);
       mascotas.add(c);
        
       
        for (Animal mascota : mascotas) {
            mascota.hacerRuido();
        }
}
}
