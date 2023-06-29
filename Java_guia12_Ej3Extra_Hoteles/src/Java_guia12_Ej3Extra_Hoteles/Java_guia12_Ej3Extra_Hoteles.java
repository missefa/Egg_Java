/*
 */
package Java_guia12_Ej3Extra_Hoteles;

import Entidad.*;
import java.util.*;

public class Java_guia12_Ej3Extra_Hoteles {

    public static void main(String[] args) {
        List<Alojamientos> aloja = new ArrayList();
        List<Hotel4> hoteles = new ArrayList();

        aloja.add(new Hotel4(2, 3, 4, 3, true, "pepe", 30, "aloja", 1234, "pilar", "artur", true));
        aloja.add(new Hotel5(2, 5, 8, 5, 2, 2, 1000, true, "asd", 2, "asdsa", 12, "", "", true));

        aloja.add(new Residencia(2, true, true, 12d, true, "gus", 2, "sdsd", "sad", false));
        aloja.add(new Camping(2, 3, true, 44d, true, "erica", 3, "merlo", "caro", false));

        for (Alojamientos x : aloja) {
            if (x instanceof Hotel5) {
                x.alojamiento();
                hoteles.add((Hotel5) x);
                
                x.mostrar();
                continue;
            }
            if (x instanceof Hotel4) {
                x.alojamiento();
                hoteles.add((Hotel4) x);
                
                x.mostrar();
                continue;
            }
            x.mostrar();

        }
        
        System.out.println("hoteles" + hoteles);
        
        hoteles.sort(Hotel4.comparaPrecio.reversed());
        
        for (Hotel4 h : hoteles) {
            System.out.println(h.getNombre() + " [valor] " + h.getPrecioDeHabitaciones());
        }
    }
}
