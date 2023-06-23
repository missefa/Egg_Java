/*
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */
package entidad;


public class EdificioOficina extends Edificio {

    @Override
    public double calcularSuperficie() {
        double superficie;
        superficie = largo*ancho ;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen;
        volumen= largo*alto*ancho;
        return volumen;
    }

    protected int numOficina;
    protected int cantPersonas;
    protected int numPisos;
    //De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
//usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
//(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
//cuantas personas entrarían en un piso y cuantas en todo el edificio.
    public int cantPersonas() {
        
        int personasPorPiso = numPisos * numOficina;
        int personasTotales = cantPersonas * numPisos;
        System.out.println("En cada piso pueden trabajar " + personasPorPiso + " personas.");
        System.out.println("En todo el edificio pueden trabajar " + personasTotales + " personas.");
        return personasTotales;
   }

    public EdificioOficina() {
    }

    public EdificioOficina(int numOficina, int cantPersonas, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficina = numOficina;
        this.cantPersonas = cantPersonas;
        this.numPisos = numPisos;
    }


    public int getNumOficina() {
        return numOficina;
    }

    public void setNumOficina(int numOficina) {
        this.numOficina = numOficina;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "EdificioOficina{" + "numOficina=" + numOficina + ", cantPersonas=" + cantPersonas + ", numPisos=" + numPisos + '}';
    }
    
}
