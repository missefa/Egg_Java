/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package java_guia7_ej4ejerciciosextra;

import java_guia7_ej4ejerciciosextra.entidades.Cuenta;


public class Java_guia7_Ej4EjerciciosExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuenta cuentin = new Cuenta(10000,'Sapo Pepe');
        System.out.println(cuentin.retirar_dinero);
        System.out.println(cuentin.retirar_dinero);
        System.out.println(cuentin.retirar_dinero);
    }
    
}
