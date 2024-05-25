/**
 *
 * @author Carlos Sánchez
 */
public class Problema1Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Problema1Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public double calcularCostoTotal(){
        return precio*cantidad;
    }
    
    public String toString(){
        return "Producto: " + nombre + " con precio de: " + precio + " y cantidad: " + cantidad;
    }
    
    
}
