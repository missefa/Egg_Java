
package entidades;


public class RevolverDeAgua {

    private Integer posicionActual;
    private Integer posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevolver() {
        
        
        this.posicionActual = (int)(Math.random()*6) +1;
        this.posicionAgua = (int)(Math.random()*6) +1;
        
        
        
    }

    public boolean mojar() {
        return this.posicionActual == this.posicionAgua;
    }

    public void siguienteChorro() {
        if (this.posicionActual>5){
            this.posicionActual = 1;
        }else {
             this.posicionActual++;
        }
        
       
    }

    @Override
    public String toString() {
        return "RevolverDeAgua>>" + "Posición Actual: " + posicionActual + ", Posición Agua: " + posicionAgua + '}';
    }


    
    
    
}
