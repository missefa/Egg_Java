
package java_guia8_ej1ejerciciosextra.servicios;

import java.util.Scanner;
import java_guia8_ej1ejerciciosextra.entidades.Raices;

public class RaicesServicio {
    Scanner read = new Scanner(System.in);
    public Raices crearFuncion(){
        System.out.println("ingrese el valor de a");
        int a = read.nextInt();
        System.out.println("ingrese el valor de b");
        int b = read.nextInt();
        System.out.println("ingrese el valor de c");
        int c = read.nextInt();
        return new Raices(a,b,c);
    }
    public double getDiscriminante(Raices r1){
        return Math.pow(r1.getB(),2)- 4*r1.getA()*r1.getC();
    }
    public boolean tieneRaices(Raices r1){
        if (getDiscriminante(r1)>=0){
            return true;
        }else{
            return false;
        }
    }
    public boolean tieneRaiz(Raices r1){
        if (getDiscriminante(r1)==0){
            return true;
        }else{
            return false;
        }
    }
    public void  obtenerRaices(Raices r1){
        if (tieneRaices(r1)== true){
            System.out.println("la primer raiz es: " + (-r1.getB()+(Math.sqrt(getDiscriminante(r1))))/(2*r1.getA()));
            System.out.println("la segunda raiz es: " + (-r1.getB()-(Math.sqrt(getDiscriminante(r1))))/(2*r1.getA()));
        }
    
    }
    public void obtenerRaiz(Raices r1){
      if (tieneRaiz(r1) == true){
          System.out.println("la raiz es: " + (-r1.getB())/(2*r1.getA()));
      } 
    }
    public void calcular(){
        if (tieneRaices(r1)== true && (tieneRaiz(r1)== true)){
            System.out.println();
        }
}
