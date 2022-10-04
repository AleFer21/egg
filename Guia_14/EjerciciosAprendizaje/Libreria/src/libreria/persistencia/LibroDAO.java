package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

public class LibroDAO extends DAO<Libro> {

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(int id) throws Exception {
        Libro libro = buscarLibroPorIsbn(id);
        super.eliminar(libro);
    }

    public List<Libro> listarLibros() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        desconectar();
        return libros;
    }

    public Libro buscarLibroPorIsbn(int id) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, id);
        desconectar();
        return libro;
    }

    public Libro buscarLibroPorTitulo(String titulo) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, titulo);
        desconectar();
        return libro;
    }

    public Libro buscarLibroPorAutor(String autor) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l, IN(l.autor) a WHERE a.nombre LIKE :autor").setParameter("autor", autor).getSingleResult();
        desconectar();
        return libro;
    }

    public Libro buscarLibroPorEditorial(String editorial) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l, IN(l.editorial) a WHERE a.nombre LIKE :editorial").setParameter("editorial", editorial).getSingleResult();
        desconectar();
        return libro;
    }

}
