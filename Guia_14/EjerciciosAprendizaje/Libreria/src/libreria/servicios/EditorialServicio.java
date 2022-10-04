package libreria.servicios;

import java.util.List;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialServicio {

    private AutorServicio autorServicio;
    private LibroServicio libroServicio;
    private final EditorialDAO dao;

    public EditorialServicio() {
        this.dao = new EditorialDAO();
    }

    public void setServicios(AutorServicio autorServicio, LibroServicio libroServicio) {
        this.autorServicio = autorServicio;
        this.libroServicio = libroServicio;
    }

    public List<Editorial> listarEditoriales() {
        try {
            return dao.listarEditoriales();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Editorial crearEditorial(String nombre) {
        Editorial editorial = new Editorial();
        try {
            editorial.setNombre(nombre);
            editorial.setAlta(Boolean.TRUE);
            dao.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial buscarEditorialPorId(int id) {
        try {
            return dao.buscarEditorialPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminarEditorialPorId(int id) {
        try {
            dao.eliminar(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
