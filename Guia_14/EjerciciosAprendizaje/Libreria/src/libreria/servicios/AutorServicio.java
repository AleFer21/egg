package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {

    private EditorialServicio editorialServicio;
    private LibroServicio libroServicio;
    private final AutorDAO dao;

    public AutorServicio() {
        this.dao = new AutorDAO();
    }

    public void setServicios(EditorialServicio editorialServicio, LibroServicio libroServicio) {
        this.editorialServicio = editorialServicio;
        this.libroServicio = libroServicio;
    }

    public List<Autor> listarAutores() {
        try {
            return dao.listarAutores();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Autor crearAutor(String nombre) {
        Autor autor = new Autor();
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Ingrese el nombre del autor.");
            }
            autor.setNombre(nombre);
            autor.setAlta(Boolean.TRUE);
            dao.guardar(autor);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Autor buscarAutorPorId(int id) {
        try {
            return dao.buscarAutorPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Autor buscarAutorPorNombre(String nombre) {
        try {
            return dao.buscarAutorPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminarAutorPorId(int id) {
        try {
            dao.eliminar(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
