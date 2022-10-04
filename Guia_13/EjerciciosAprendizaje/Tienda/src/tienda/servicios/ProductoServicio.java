package tienda.servicios;

import java.util.*;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoServicio {

    private ProductoDAO dao;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }

    public Collection<Producto> listarProducto() throws Exception {
        try {
            Collection<Producto> productos = dao.listarProductos();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    //Apartado a
    public void imprimirProductosPorNombre() throws Exception {
        try {
            Collection<Producto> productos = listarProducto();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir.");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //Apartado b
    public void imprimirProductosPorNombreYPrecio() {
        try {
            Collection<Producto> productos = listarProducto();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir.");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.getNombre() + ", $" + p.getPrecio());
                }
            }
        } catch (Exception e) {
        }
    }

    //Apartado c
    public void imprimirProductosPorPrecio() {
        try {
            Collection<Producto> productos = listarProducto();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir.");
            } else {
                for (Producto p : productos) {
                    if (p.getPrecio() >= 120 && p.getPrecio() <= 200) {
                        System.out.println(p.getNombre() + ", $" + p.getPrecio());
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    //Apartado d
    public Collection<Producto> listarPortatiles() throws Exception {
        try {
            Collection<Producto> productos = dao.listarPortatiles();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirPortatiles() {
        try {
            Collection<Producto> productos = listarPortatiles();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir.");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.getNombre() + ", $" + p.getPrecio());
                }
            }
        } catch (Exception e) {
        }
    }

    //Apartado e
    public Collection<Producto> listarProductoMasBarato() throws Exception {
        try {
            Collection<Producto> productos = dao.listarProductoMasBarato();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductoMasBarato() {
        try {
            Collection<Producto> productos = listarProductoMasBarato();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir.");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.getNombre() + ", $" + p.getPrecio());
                }
            }
        } catch (Exception e) {
        }
    }

    //Apartado f
    public void crearProducto(String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del producto.");
            }
            if (precio < 0) {
                throw new Exception("Debe indicar el precio del producto.");
            }
            if (codigoFabricante < 0) {
                throw new Exception("Debe indicar el codigo del fabricante del producto.");
            }
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);
            dao.guardarProducto(producto);
            System.out.println("Producto creado: " + producto.getNombre() + ", $" + producto.getPrecio() + ", " + producto.getCodigoFabricante());
        } catch (Exception e) {
            throw e;
        }
    }

    //Apartado h
    public void actualizarPrecio(int codigo, String nombre, double nuevoPrecio, int codigoFabricante) throws Exception {
        try {
            if (codigo < 0) {
                throw new Exception("Debe indicar el codigo del producto.");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del producto.");
            }
            if (nuevoPrecio < 0) {
                throw new Exception("Debe indicar el precio del producto.");
            }
            if (codigoFabricante < 0) {
                throw new Exception("Debe indicar el codigo del fabricante del producto.");
            }
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(nuevoPrecio);
            producto.setCodigoFabricante(codigoFabricante);
            dao.modificarProducto(producto);
            System.out.println("Precio actualizado: $" + producto.getPrecio());
        } catch (Exception e) {
            throw e;
        }
    }

}
