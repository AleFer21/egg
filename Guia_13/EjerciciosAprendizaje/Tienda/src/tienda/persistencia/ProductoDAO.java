package tienda.persistencia;

import java.util.*;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto.");
            }
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante)"
                    + "VALUES ('" + producto.getNombre() + "', '" + producto.getPrecio() + "', '" + producto.getCodigoFabricante() + "')";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar.");
            }
            String sql = "UPDATE producto SET "
                    + "nombre = '" + producto.getNombre() + "', precio = '" + producto.getPrecio() + "', "
                    + "codigo_fabricante = '" + producto.getCodigoFabricante() + "' "
                    + "WHERE codigo = '" + producto.getCodigo() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarProducto(Producto producto) throws Exception {
        try {
            String sql = "DELETE FROM producto WHERE codigo = '" + producto.getCodigo() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = '" + codigo + "'";
            consultarBase(sql);
            Producto producto = null;
            while (rs.next()) {
                producto = new Producto();
                producto.setCodigo(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio(rs.getDouble(3));
                producto.setCodigoFabricante(rs.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Producto buscarProductoPorCodigoFabricante(int codigoFabricante) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo_fabricante = '" + codigoFabricante + "'";
            consultarBase(sql);
            Producto producto = null;
            while (rs.next()) {
                producto = new Producto();
                producto.setCodigo(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio(rs.getDouble(3));
                producto.setCodigoFabricante(rs.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (rs.next()) {
                producto = new Producto();
                producto.setCodigo(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio(rs.getDouble(3));
                producto.setCodigoFabricante(rs.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema.");
        }
    }

    public Collection<Producto> listarPortatiles() throws Exception {
        try {
            String nombre = "portatil";
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%" + nombre + "%'";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (rs.next()) {
                producto = new Producto();
                producto.setCodigo(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio(rs.getDouble(3));
                producto.setCodigoFabricante(rs.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema.");
        }
    }

    public Collection<Producto> listarProductoMasBarato() throws Exception {
        try {
            String sql = "SELECT nombre, MIN(precio) FROM producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (rs.next()) {
                producto = new Producto();
                producto.setNombre(rs.getString(1));
                producto.setPrecio(rs.getDouble(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema.");
        }
    }

}
