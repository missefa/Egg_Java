/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la palabra a buscar, 
la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario.
*/

package java_guia9_ej2ejerciciosextra;

import entidades.Ahorcado;
import entidadesServicios.AhorcadoServicios;


public class Java_guia9_Ej2EjerciciosExtra {

    
    public static void main(String[] args) {
        
        AhorcadoServicios as = new AhorcadoServicios();
        Ahorcado ahorcado1 = new Ahorcado();
        
        
       as.juego();
        
   //     System.out.println(ahorcado1.getPalabra()[0] + ahorcado1.getPalabra()[1]);
   //     System.out.println(ahorcado1.getPalabra().length);
    }
    
}
