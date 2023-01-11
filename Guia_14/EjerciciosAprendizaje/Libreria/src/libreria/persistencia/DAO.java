package libreria.persistencia;

import javax.persistence.*;

public class DAO<T> {

    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    protected EntityManager em = emf.createEntityManager();

    protected void conectar() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }

    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    protected void guardar(T objeto) {
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    protected void editar(T objeto) {
        conectar();
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    protected void eliminar(T objeto) {
        conectar();
        em.getTransaction().begin();
        em.remove(em.merge(objeto));
        em.getTransaction().commit();
        desconectar();
    }

}
