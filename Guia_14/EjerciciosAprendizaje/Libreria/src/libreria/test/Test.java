package libreria.test;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class Test {
    
    public static void main(String[] args) {
        
        final AutorServicio autorServicio = new AutorServicio();
//        Autor autor = autorServicio.crearAutor("Ludwig von Mises");
        
        final EditorialServicio editorialServicio = new EditorialServicio();
//        Editorial editorial = editorialServicio.crearEditorial("Union");
        
        LibroServicio libroServicio = new LibroServicio();
//        String nombre = "La accion humana";
//        int anio = 1949;
//        int ejemplares = 50;
//        int ejemplaresPrestados = 43;
//        int ejemplaresRestantes = ejemplares - ejemplaresPrestados;
//        libroServicio.crearLibro(nombre, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, autor, editorial);

//        System.out.println(libroServicio.buscarLibroPorAutor("Ernesto Sabato"));
//        System.out.println(libroServicio.buscarLibroPorEditorial("Union"));
//        System.out.println(libroServicio.buscarLibroPorIsbn(2));

        libroServicio.imprimirLibros();
//        libroServicio.eliminarLibroPorIsbn(4);
        System.out.println("");
        libroServicio.imprimirLibros();
        
    }
    
}
