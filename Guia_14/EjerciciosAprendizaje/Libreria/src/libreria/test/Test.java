package libreria.test;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class Test {

    public static void main(String[] args) {
        
//        final AutorServicio autorServicio = new AutorServicio();
//        Autor autor = autorServicio.crearAutor("J.R.R. Tolkein");
//        
//        final EditorialServicio editorialServicio = new EditorialServicio();
//        Editorial editorial = editorialServicio.crearEditorial("Minotauro");

        LibroServicio libroServicio = new LibroServicio();
//        String nombreLibro = "El Señor de los Anillos";
//        int anio = 1954;
//        int ejemplares = 37;
//        int ejemplaresPrestados = 17;
//        int ejemplaresRestantes = ejemplares - ejemplaresPrestados;
//        libroServicio.crearLibro(nombreLibro, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, autor, editorial);

//        autorServicio.eliminarAutorPorId(2);
//        editorialServicio.eliminarEditorialPorId(2);

        libroServicio.listarLibros().forEach((l) -> System.out.println(l.toString()));
//        System.out.println("Hola");

    }

}
