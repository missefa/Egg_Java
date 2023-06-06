/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_guia11_ej3ejercicios_otro;

import entidades.Carta;
import java.util.ArrayList;

/**
 *
 * @author JosePc
 */
public class Java_guia11_Ej3Ejercicios_OTRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carta car = new Carta();
        ArrayList<Carta> mazo = new ArrayList<>();
        
        
      mazo = car.generarCartas();
      
      
      car.mostrarBaraja(mazo);
      
          }
    
}
