/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author JosePc
 */
public class Voto {
    private Alumno alu;
    private ArrayList<Alumno> aluVotados;

    public Voto() {
    }

    public Voto(Alumno alu, ArrayList<Alumno> aluVotados) {
        this.alu = alu;
        this.aluVotados = aluVotados;
    }

    public Alumno getAlu() {
        return alu;
    }

    public void setAlu(Alumno alu) {
        this.alu = alu;
    }

    public ArrayList<Alumno> getAluVotados() {
        return aluVotados;
    }

    public void setAluVotados(ArrayList<Alumno> aluVotados) {
        this.aluVotados = aluVotados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alu=" + alu + ", aluVotados=" + aluVotados + '}';
    }
     
    
    
}
