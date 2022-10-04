package test;

import libro.Libro;
import servicio.LibroService;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Libro libro1 = new Libro(123, "La vuelta al mundo en 80 dias", "Julio Verne", 224);
        System.out.println(libro1);
        
        LibroService libroService = new LibroService();
        
        Libro libro2 = libroService.cargarLibro();
        System.out.println(libro2);
        
    }
    
}
