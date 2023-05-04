/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guia9_ej1ejercicios_otro;

import java_guia9_ej1ejercicios_otro.entidades.Cadena;
import java_guia9_ej1ejercicios_otro.servicio.CadenaServicio;
import static java_guia9_ej1ejercicios_otro.servicio.CadenaServicio.invertirFrase;
import static java_guia9_ej1ejercicios_otro.servicio.CadenaServicio.mostrarVocales;

public class Java_guia9_Ej1Ejercicios_OTRO {

    public static void main(String[] args) {
        CadenaServicio cs1 = new CadenaServicio();
        Cadena c1 = cs1.ingreseFrase();

        mostrarVocales(c1);
        invertirFrase(c1);
        System.out.println(c1.toString());

    }

}