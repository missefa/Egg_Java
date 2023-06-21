/*
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package Entidades;

import Interfaces.calculosFormas;

/**
 *
 * @author Erica
 */
public class Rectangulo implements calculosFormas{
   
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculoArea() {
        return this.base * this.altura;
    }
    
    @Override
    public double calculoPerimetro(){
        return (this.base + this.altura)*2;
    }
    
}
