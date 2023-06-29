/*
los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
 */
package Entidad;

public class Camping extends Extrahotelero {

    protected Integer capacidadMaximaDeCarpas;
    protected Integer banios;
    protected Boolean restaurante;

    public Camping(Integer capacidadMaximaDeCarpas, Integer banios, Boolean restaurante, Double m2, Boolean privado, String nombre, Integer dirección, String localidad, String gerenteEncargado, Boolean alojamiento) {
        super(m2, privado, nombre, dirección, localidad, gerenteEncargado, alojamiento);
        this.capacidadMaximaDeCarpas = capacidadMaximaDeCarpas;
        this.banios = banios;
        this.restaurante = restaurante;
    }

    public Integer getCapacidadMaximaDeCarpas() {
        return capacidadMaximaDeCarpas;
    }

    public void setCapacidadMaximaDeCarpas(Integer capacidadMaximaDeCarpas) {
        this.capacidadMaximaDeCarpas = capacidadMaximaDeCarpas;
    }

    public Integer getBanios() {
        return banios;
    }

    public void setBanios(Integer banios) {
        this.banios = banios;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public void mostrar() {
        System.out.println("campi");
    }
}
