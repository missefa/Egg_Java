/*
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.

Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
*/
package Java_guia12_Ej2ExtraOtro_Edificios;


import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;
import java.util.List;

public class Java_guia12_Ej2ExtraOtro_Edificios {

    public static void main(String[] args) {
       List<Edificio> construciones = new ArrayList();
        
        Edificio o1 = new EdificioDeOficinas(12d,45d,23d);
        Edificio o2 = new EdificioDeOficinas(14d,40d,10d);
 
        construciones.add(o1);
        construciones.add(o2);
        
        
        construciones.add(new Polideportivo("sarasa",true,16d,5d,2d));
        construciones.add(new Polideportivo("polideportivo",false,112d,452d,223d));
        
        int techado = 0;
        
        for (Edificio co: construciones) {
            if (co instanceof EdificioDeOficinas) {
                System.out.println("Superficie: " + ((EdificioDeOficinas) co).calcularSuperficie());
                System.out.println("Volumen: " + ((EdificioDeOficinas) co).calcularVolumen());
                
                ((EdificioDeOficinas) co).cantPersonas();
            }
            
            if (co instanceof Polideportivo) {
                if (((Polideportivo) co).getInstalacion()) {
                    techado++;
                }
                System.out.println("Superficie: " + ((Polideportivo) co).calcularSuperficie());
                System.out.println("Volumen: " + ((Polideportivo) co).calcularVolumen());
            }
            
        }
        
        System.out.println("Polis techados: " +  techado);
        
    }
    
}
