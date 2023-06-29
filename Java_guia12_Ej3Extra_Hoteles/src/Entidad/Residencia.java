/*
los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
 */

package Entidad;


public class Residencia extends Extrahotelero{
    protected Integer cantidadDeHabitaciones;
    protected Boolean descuentosGremios;
    protected Boolean campoDeportivo;

    public Residencia(Integer cantidadDeHabitaciones, Boolean descuentosGremios, Boolean campoDeportivo, Double m2, Boolean privado, String nombre, Integer dirección, String localidad, String gerenteEncargado, Boolean alojamiento) {
        super(m2, privado, nombre, dirección, localidad, gerenteEncargado, alojamiento);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(Integer cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public Boolean getDescuentosGremios() {
        return descuentosGremios;
    }

    public void setDescuentosGremios(Boolean descuentosGremios) {
        this.descuentosGremios = descuentosGremios;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    @Override
    public void mostrar() {
        System.out.println("resi");
    }
}
