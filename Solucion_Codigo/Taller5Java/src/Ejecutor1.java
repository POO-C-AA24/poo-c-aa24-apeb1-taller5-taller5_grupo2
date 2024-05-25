public class Ejecutor1 {

    public static void main(String[] args) {
        //Agregar productos:
        Problema1Producto producto1 = new Problema1Producto("Leche", 1.25, 3);
        Problema1Producto producto2 = new Problema1Producto("Pez de bolivia", 500, 1);
        Problema1Producto producto3 = new Problema1Producto("Agua de mar de bolivia", 69, 2);
        Problema1Producto producto4 = new Problema1Producto("Manzanas de groelandia", 5, 20);
        Problema1Producto producto5 = new Problema1Producto("Carne de dinosaurio", 2.50, 8);
        Problema1Producto producto6 = new Problema1Producto("Piel de dodo", 5, 40);
        
        //Agregar productos al carrito de compras:
        Problema1CarritoCompras carrito = new Problema1CarritoCompras();
        
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto5);
        carrito.agregarProducto(producto6);
        
        int dineroDisponible = 223; //Cantidad disponible de ejemplo
        carrito.mostrarDetallesCompra(); //Mostrar detalles
        System.out.println(carrito.calcularTotal()); //Mostrar el total de la compra del carrito.
        carrito.realizarPago(dineroDisponible); //Realizar el pago. Se informará si pudo pagar o no. 
    }
}
