package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

public class LibroServicio {

    private AutorServicio autorServicio;
    private EditorialServicio editorialServicio;
    private final LibroDAO dao;

    public LibroServicio() {
        this.dao = new LibroDAO();
    }

    public void setServicios(AutorServicio autorServicio, EditorialServicio editorialServicio) {
        this.autorServicio = autorServicio;
        this.editorialServicio = editorialServicio;
    }

    public List<Libro> listarLibros() {
        try {
            return dao.listarLibros();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Libro crearLibro(String titulo, int anio, int ejemplares, int ejemplaresPrestados, int ejemplaresRestantes, Autor autor, Editorial editorial) {
        Libro libro = new Libro();
        try {
            if(titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("Debe ingresar el titulo.");
            }
            if(anio < 0) {
                throw new Exception("Debe ingresar el año.");
            }
            if(ejemplares < 0) {
                throw new Exception("Debe ingresar la cantidad de ejemplares.");
            }
            if(ejemplaresPrestados < 0) {
                throw new Exception("Debe ingresar la cantidad de ejemplares prestados.");
            }
            if(autor == null) {
                throw new Exception("Debe ingresar el autor.");
            }
            if(editorial == null) {
                throw new Exception("Debe ingresar la editorial.");
            }
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAlta(Boolean.TRUE);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            dao.guardar(libro);
            System.out.println("Libro creado: " + libro.toString());
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro buscarLibroPorIsbn(int isbn) {
        try {
            return dao.buscarLibroPorIsbn(isbn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        try {
            return dao.buscarLibroPorTitulo(titulo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro buscarLibroPorAutor(String autor) {
        try {
            return dao.buscarLibroPorAutor(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Libro buscarLibroPorEditorial(String editorial) {
        try {
            return dao.buscarLibroPorEditorial(editorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminarLibroPorIsbn(int isbn) {
        try {
            dao.eliminar(isbn);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void imprimirLibros() {
        try {
            List<Libro> libros = listarLibros();
            if (libros.isEmpty()) {
                throw new Exception("No existen libros en la base de datos.");
            } else {
                for (Libro l : libros) {
                    System.out.println(l.toString());
                }
            }
        } catch (Exception e) {
        }
    }

}
