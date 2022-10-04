package test;

import servicio.ProductosServicio;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        ProductosServicio ps = new ProductosServicio();
        ps.crearProducto();
        ps.mostrarProductos();
        ps.moficarPrecio();
        ps.mostrarProductos();
        ps.eliminarProducto();
        ps.mostrarProductos();
        
    }
    
}
