/*
 Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio8.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package java_guia12_ej2ejerciciosextra;

import entidad.Edificio;
import entidad.EdificioOficina;
import entidad.Polideportivo;
import java.util.ArrayList;

public class Java_guia12_Ej2EjerciciosExtra {

    public static void main(String[] args) {

        ArrayList<Edificio> edificios = new ArrayList<>();
        edificios.add(new Polideportivo(30, 42, 62, "polideportivo1", false));
        edificios.add(new Polideportivo(20, 52, 41, "polideportivo2", false));
        edificios.add(new EdificioOficina(10, 155, 17, 10, 10, 1));
        edificios.add(new EdificioOficina(23, 24, 26, 20, 201, 2));
        for (Edificio edificio : edificios) {
            System.out.println("superficie: " + edificio.calcularSuperficie());
            System.out.println("volumen: " + edificio.calcularVolumen());
        }
        int techado = 0;
        int abierto = 0;
        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                if (((Polideportivo) edificio).isInstalacion()) {
                    techado++;
                    

                } else {
                    abierto++;
                }
            }
          
                
        }
        System.out.println("techados " + techado + " abierto " + abierto);
        
        for (Edificio edificio : edificios) {
             if (edificio instanceof EdificioOficina) {
                 EdificioOficina edificioOficina = (EdificioOficina)edificio;
           // System.out.println("el edificio tiene  "+((EdificioOficina) edificio).getCantPersonas() + " personas en el edificio");
                  
            edificioOficina.cantPersonas();

        
                } 
            
        }
    }
    
}
