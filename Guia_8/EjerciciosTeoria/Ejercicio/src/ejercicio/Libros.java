package ejercicio;

import java.util.*;

public class Libros {
    
    public static void main(String[] args) {
        
        List<String> libros = new ArrayList<>();
        
        libros.add("La vuelta al mundo en 80 dias");
        libros.add("La accion humana");
        libros.add("La revolucion");
        libros.add("Viaje al centro de la tierra");
        
        libros.forEach(elemento -> {
            System.out.println("Libro: " + elemento);
        });
        
    }
    
}
