/*
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */
package Entidad;

public class EdificioDeOficinas extends Edificio {

    protected Integer oficinas;
    protected Integer personas;
    protected Integer numeroPisos;

    public EdificioDeOficinas(Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
    }

    public Integer getOficinas() {
        return oficinas;
    }

    public void setOficinas(Integer oficinas) {
        this.oficinas = oficinas;
    }

    public Integer getPersonas() {
        return personas;
    }

    public void setPersonas(Integer personas) {
        this.personas = personas;
    }

    public Integer getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(Integer numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

//    • Método calcularSuperficie(): calcula la superficie del edificio.
    @Override
    public double calcularSuperficie() {
        return largo * ancho;
    }

//    • Método calcularVolumen(): calcula el volumen del edifico.
    @Override
    public double calcularVolumen() {
        return calcularSuperficie() * alto;
    }

    public void cantPersonas() {
        System.out.println("Pisos del edificio: ");
        numeroPisos = read.nextInt();
        
        System.out.println("Cantidad de personas por oficina ");
        personas = read.nextInt();
        
        System.out.println("Oficinas por piso: ");
        oficinas = read.nextInt();

        System.out.println("En un piso entran: " + (personas * oficinas)  +" personas");
        System.out.println("En el edificio entran " + (personas * oficinas * numeroPisos) + " personas");

    }
}
