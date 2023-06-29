/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.

*/

package Entidad;

public abstract class Alojamientos {
    protected String nombre;
    protected Integer dirección;
    protected String localidad; 
    protected String gerenteEncargado;
    protected Boolean alojamiento;

    public Alojamientos() {
    }

    public Alojamientos(String nombre, Integer dirección, String localidad, String gerenteEncargado, Boolean alojamiento) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.localidad = localidad;
        this.gerenteEncargado = gerenteEncargado;
        this.alojamiento = alojamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDirección() {
        return dirección;
    }

    public void setDirección(Integer dirección) {
        this.dirección = dirección;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerenteEncargado() {
        return gerenteEncargado;
    }

    public void setGerenteEncargado(String gerenteEncargado) {
        this.gerenteEncargado = gerenteEncargado;
    }

    public Boolean getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Boolean alojamiento) {
        this.alojamiento = alojamiento;
    }
    
    public abstract void alojamiento();
    
    public abstract void mostrar();
}
