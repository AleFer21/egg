package libreria.test;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class Test {
    
    public static void main(String[] args) {
        
        final AutorServicio autorServicio = new AutorServicio();
        Autor autor = autorServicio.crearAutor("J.R.R. Tolkien");
        
        final EditorialServicio editorialServicio = new EditorialServicio();
        Editorial editorial = editorialServicio.crearEditorial("Minotauro");
        
        LibroServicio libroServicio = new LibroServicio();
        String nombre = "El Señor de los Anillos";
        int anio = 1954;
        int ejemplares = 37;
        int ejemplaresPrestados = 15;
        int ejemplaresRestantes = ejemplares - ejemplaresPrestados;
        libroServicio.crearLibro(nombre, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, autor, editorial);
        
    }
    
}
