/*
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
package Entidades;

import Interfaces.calculosFormas;

/**
 *
 * @author Erica
 */
public class Circulo implements calculosFormas {
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculoArea() {
        return PI * Math.pow(this.radio, 2);
    }
    
    @Override
    public double calculoPerimetro(){
        return PI * (radio*2);
    }

}