//
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



package java_guia9_ej3ejercicios;

import java_guia9_ej3ejercicios.servicio.ArregloService;


public class Java_guia9_Ej3Ejercicios {

 
    public static void main(String[] args) {
       
        Double A[];
        Double B[];
        
        A = new Double[50];
        B = new Double[20];
        
       ArregloService pn = new ArregloService();
       
       pn.inicializarA(A);
       
         pn.mostrar(A);
         
          pn.ordenar(A);
          
          pn.mostrar(A);
     
           pn.inicializarB(A,B);
           
           System.out.println("Vector A: ");
           pn.mostrar(A);
           
           System.out.println("");
           
           
            System.out.println("Vector B: ");
           pn.mostrar(B);
           
           System.out.println("");
          
    }
    
}
