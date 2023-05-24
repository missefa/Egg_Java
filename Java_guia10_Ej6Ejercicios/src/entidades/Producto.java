
package entidades;


public class Producto {
    
    private String nomProducto;
    private Double precioProducto;

    public Producto() {
    }

    public Producto(String nomProducto, Double precioProducto) {
        this.nomProducto = nomProducto;
        this.precioProducto = precioProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    
    
    
    
    
}
