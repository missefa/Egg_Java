/*
 Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

16
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package entidad;


public class Polideportivo extends Edificio{
    protected String nombre;
    protected boolean instalacion;
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

    public Polideportivo() {
    }

    public Polideportivo(double ancho, double alto, double largo, String nombre, boolean instalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isInstalacion() {
        return instalacion;
    }

    public void setInstalacion(boolean instalacion) {
        this.instalacion = instalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", instalacion=" + instalacion + '}';
    }
    
}
