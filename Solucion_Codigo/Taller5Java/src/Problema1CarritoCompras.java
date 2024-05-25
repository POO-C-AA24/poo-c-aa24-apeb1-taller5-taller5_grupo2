import java.util.ArrayList;

public class Problema1CarritoCompras {
    ArrayList<Problema1Producto> productos = new ArrayList<>();
    double descuentoPorcentaje = 0.10;
    
    public void agregarProducto(Problema1Producto producto){
        productos.add(producto);
    }
    
    public int calcularTotal(){
        int precioCarrito = 0;
        for(Problema1Producto producto : productos){
            precioCarrito += producto.calcularCostoTotal();
        }
        
        return precioCarrito;
    }
    
    public void realizarPago(int dineroUsuario){
        int montoAPagar = calcularTotal();
        
        if(dineroUsuario < montoAPagar){
            System.out.println("Dinero insuficiente, te faltan: " + (montoAPagar - dineroUsuario));
            return;
        }
        
        if(montoAPagar > 1000){
            System.out.println("Obtienes descuento del 10% por superar los $1000 de compra");
            montoAPagar -= montoAPagar * descuentoPorcentaje;
        }
        
        System.out.println("El precio total de tu compra es de: " + montoAPagar);
        System.out.println("Pagaste: " + dineroUsuario);
        System.out.println("Tu cambio es de: " + (dineroUsuario - montoAPagar));
    }
    
    public void mostrarDetallesCompra(){
          for(Problema1Producto producto : productos){
              System.out.println(producto.toString());
        }
    }
    
    
    
    
}
