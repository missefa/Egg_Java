
package entidadesServicios;

import entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicios {
 Scanner leerTexto = new Scanner(System.in);
        Scanner leerNum = new Scanner(System.in);
    
    
    public Ahorcado crearJuego() {
       
        String auxPalabra;
        int cJM;

        System.out.println("Ingrese la palabra a adivinar: ");
        auxPalabra = leerTexto.nextLine();

        String[] letras = new String[auxPalabra.length()];

        for (int i = 0; i < letras.length; i++) {
            letras[i] = auxPalabra.substring(i, i + 1);
        }

        System.out.println("Ingrese la cantidad de jugadas máxima: ");
        cJM = leerNum.nextInt();

        return new Ahorcado(letras, 0, cJM);
    }

    public void longitud(Ahorcado a1) {
        System.out.println("La longitud de la palabra a adivinar es: " + a1.getPalabra().length);
    }

    public boolean buscar(Ahorcado a1, String letra) {
        boolean encontro = false;

        for (int i = 0; i < a1.getPalabra().length; i++) {
            if (a1.getPalabra()[i].equalsIgnoreCase(letra)) {
                encontro = true;

            }

        }
        return encontro;
    }

    public boolean encontradas(Ahorcado a1, String letra) {
        boolean encontro = false;

        for (int i = 0; i < a1.getPalabra().length; i++) {
            if (this.buscar(a1, letra)) {
                encontro = true;
                a1.setCantLetrasEncontradas((a1.getCantLetrasEncontradas() + 1));

            }

        }
        a1.setCantJugadasMaximas((a1.getCantJugadasMaximas() - 1));
        return encontro;

    }

    public void intentos(Ahorcado a1){
        System.out.println("Le quedan " + a1.getCantJugadasMaximas() + " intentos de juego");
    }
    
    public void juego(){
        
        Ahorcado a1 = new Ahorcado();
        String letra;
        
        a1 = this.crearJuego();
        
        do {
            System.out.println("Ingrese una letra a buscar: ");
          letra = leerTexto.next();
          
          System.out.println("La longitud de la palabra es : " + a1.getPalabra().length);
          
          if (buscar(a1 , letra)) {
              System.out.println("La letra pertenece a la palabra ");
          }else{
              System.out.println("La letra no pertenece a la palabra");
          }
                
          System.out.println("La cantidad de letras encontradas es " + a1.getCantLetrasEncontradas() + " falta encontrar " + (a1.getPalabra().length - a1.getCantLetrasEncontradas()));
        
          
        } while (a1.getCantJugadasMaximas() > 0);
          
    }
    
    
    
    
}
