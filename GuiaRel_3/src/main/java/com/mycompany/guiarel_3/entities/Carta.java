package com.mycompany.guiarel_3.entities;

import com.mycompany.guiarel_3.entities.enumciados.Palos;

public class Carta {
    private int numero;
    private Palos palo;

    public Carta() {
    }

    public Carta(int numero, Palos palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
    
}
