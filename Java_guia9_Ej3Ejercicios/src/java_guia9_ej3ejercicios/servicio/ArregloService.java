//Clase Arrays
//3. Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
//arreglo B de 20 números reales. Crear la clase ArregloService, en el
//paquete servicio, con los siguientes métodos:
//1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
//números aleatorios.
//2) Método mostrar recibe un arreglo por parámetro y lo muestra por
//pantalla.
//3) Método ordenar recibe un arreglo por parámetro y lo ordena de
//mayor a menor.
//4) Método inicializarB copia los primeros 10 números del arreglo A en el
//arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
//En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
//mostrar A y B.


package java_guia9_ej3ejercicios.servicio;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author JosePc
 */
public class ArregloService {

    public void inicializarA(Double A[]) {
        Double aux;

        for (int i = 0; i < 50; i++) {

            aux = (Math.random() * 100);

            A[i] = aux;

        }

    }

    public void mostrar(Double A[]) {
      
        DecimalFormat df = new DecimalFormat("####0.00");

        for (int i = 0; i < A.length ; i++) {
          System.out.print(df.format(A[i]) + " - ");
// System.out.print(A[i]  + " - ");
        }
        System.out.println("");
    }

    
    
    
    
    
    
    public void ordenar(Double A[]) {

        Arrays.sort(A, Comparator.reverseOrder());

    }
    
    public void inicializarB(Double A[], Double B[]){
        
        for (int i=0 ; i<10 ; i++){
            B[i] = A[i];
                     
        }
         for (int i=10 ; i<20 ; i++){
            B[i] = (Double)(0.5) ;
            
            
                     
        }
        
        
        
    }
    
    
}
