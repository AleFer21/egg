package servicio;

import java.util.*;
import productos.Productos;

public class ProductosServicio {

    private Scanner scanner;
    private Map<String, Integer> productos;

    public ProductosServicio() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
        this.productos = new HashMap<>();
    }
    
    public Productos crearProducto(){
        Productos producto = new Productos();
        String respuesta;
        do{
            System.out.println("Ingrese el nombre del producto:");
            String nombre = scanner.next();
            System.out.println("Ingrese el precio del producto:");
            int precio = scanner.nextInt();
            producto = new Productos(nombre, precio);
            productos.put(nombre, precio);
            System.out.println("Desea agregar otro producto? Si/No");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("si"));
        return producto;
    }
    
    public void mostrarProductos(){
        System.out.println("Los productos son:");
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": $" + value);
        }
    }
    
    public void moficarPrecio(){
        System.out.println("Ingrese el producto a modificar:");
        String nombre = scanner.next();
        System.out.println("Ingrese el nuevo precio:");
        int precio = scanner.nextInt();
        productos.replace(nombre, precio);
    }
    
    public void eliminarProducto(){
        System.out.println("Ingrese el producto a eliminar:");
        String eliminar = scanner.next();
        productos.remove(eliminar);
    }
    
}
