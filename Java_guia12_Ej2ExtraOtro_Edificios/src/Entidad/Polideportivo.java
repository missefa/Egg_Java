/*
 Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package Entidad;

public class Polideportivo extends Edificio {

    protected String nombre;
    protected Boolean instalacion;

    public Polideportivo(String nombre, Boolean instalacion, Double ancho, Double alto, Double largo) {
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

    public Boolean getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(Boolean instalacion) {
        this.instalacion = instalacion;
    }

//    • Método calcularSuperficie(): calcula la superficie del edificio.
    @Override
    public double calcularSuperficie() {
        return largo*ancho;
    }
    
//    • Método calcularVolumen(): calcula el volumen del edifico.
    @Override
    public double calcularVolumen() {
        return calcularSuperficie() * alto;
    }

}
