package tienda.test;

import java.util.Scanner;
import tienda.servicios.FabricanteServicio;
import tienda.servicios.ProductoServicio;

public class Test {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        ProductoServicio ps = new ProductoServicio();
        FabricanteServicio fs = new FabricanteServicio();

        int opcion;

        do {
            System.out.println("Seleccione un opcion:");
            System.out.println("1 - Mostrar el nombre de todos los productos.");
            System.out.println("2 - Mostrar el nombre y el precuo de todos los productos.");
            System.out.println("3 - Mostrar los productos que tengan un precio entre $120 y $202.");
            System.out.println("4 - Mostrar todos los portatiles.");
            System.out.println("5 - Mostrar el producto mas barato.");
            System.out.println("6 - Ingresar un producto nuevo a la base de datos.");
            System.out.println("7 - Ingresar un fabricante nuevo a la base de datos.");
            System.out.println("8 - Actualizar el precio de un producto.");
            System.out.println("9 - Salir.");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Lista con el nombre de los productos:");
                    ps.imprimirProductosPorNombre();
                    break;
                case 2:
                    System.out.println("Lista con el nombre y precio de los productos:");
                    ps.imprimirProductosPorNombreYPrecio();
                    break;
                case 3:
                    System.out.println("Productos con precio entre $120 y $202:");
                    ps.imprimirProductosPorPrecio();
                    break;
                case 4:
                    System.out.println("Lista de portatiles:");
                    ps.imprimirPortatiles();
                    break;
                case 5:
                    System.out.println("Producto mas barato:");
                    ps.imprimirProductoMasBarato();
                    break;
                case 6:
                    System.out.println("Ingresar un nuevo producto.");
                    System.out.println("Ingrese el nombre:");
                    String nombreProducto = scanner.next();
                    System.out.println("Ingresar el precio:");
                    double precio = scanner.nextDouble();
                    System.out.println("Ingresar el codigo del fabricante:");
                    int codigoFabricante = scanner.nextInt();
                    ps.crearProducto(nombreProducto, precio, codigoFabricante);
                    break;
                case 7:
                    System.out.println("Ingresar un nuevo fabricante.");
                    System.out.println("Ingrese el nombre:");
                    String nombreFabricante = scanner.next();
                    fs.crearFabricante(nombreFabricante);
                    break;
                case 8:
                    System.out.println("Actualizar el precios.");
                    System.out.println("Ingrese el codigo del producto");
                    int codigo = scanner.nextInt();
                    System.out.println("Ingrese el nombre del producto:");
                    String nombre = scanner.next();
                    System.out.println("Ingresar el nuevo precio del producto:");
                    double precioNuevo = scanner.nextDouble();
                    System.out.println("Ingresar el codigo del fabricante del producto:");
                    int codigoFabricante2 = scanner.nextInt();
                    ps.actualizarPrecio(codigo, nombre, precioNuevo, codigoFabricante2);
                    break;
                default:
                    System.out.println("Usted ha salido del sistema.");
                    return;
            }
        } while (opcion != 9);
    }

}
