/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guia10_ejperro;

import Servicios.AlumnoService;

/**
 *
 * @author Usuario
 */
public class pruebAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoService as = new AlumnoService();
        double notapromedio = as.FabricAlumnos();
        System.out.println(notapromedio);
    }
    
}
