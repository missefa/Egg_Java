/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guia7_ej4ejerciciosextra.entidades;

/**
 *
 * @author Erica
 */
public class Cuenta {
    private double saldo;
    private String titular;
    public boolean retirar_dinero;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public String retirar_dinero(double cantidad) {
        if (cantidad > saldo) {
            return "Lo sentimos, su saldo (" + saldo + ") es inferior a la cantidad que quiere extraer (" + cantidad + ").";
        } else {
            saldo = (saldo - cantidad);
            return "Su saldo, después de la extracción es de " + saldo + ".";
        }
    }
}
