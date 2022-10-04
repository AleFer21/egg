package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

public class AutorDAO extends DAO<Autor> {

    public List<Autor> listarAutores() throws Exception {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar();
        return autores;
    }

    public Autor buscarAutorPorId(int id) throws Exception {
        conectar();
        Autor autor = em.find(Autor.class, id);
        desconectar();
        return autor;
    }

    public Autor buscarAutorPorNombre(String nombre) throws Exception {
        conectar();
        Autor autor = em.find(Autor.class, nombre);
        desconectar();
        return autor;
    }

    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    public void eliminar(int id) throws Exception {
        Autor autor = buscarAutorPorId(id);
        super.eliminar(autor);
    }

}
