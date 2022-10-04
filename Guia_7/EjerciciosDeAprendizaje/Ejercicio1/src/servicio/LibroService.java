package servicio;

import libro.Libro;
import java.util.Scanner;

public class LibroService {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Libro cargarLibro() {
        
        Libro libroCompleto = new Libro();
        System.out.println("Ingresar el ISBN:");
        libroCompleto.setIsbn(scanner.nextInt());
        System.out.println("Ingresar el titulo:");
        libroCompleto.setTitulo(scanner.next());
        System.out.println("Ingresar el autor:");
        libroCompleto.setAutor(scanner.next());
        System.out.println("Ingrese la cantidad de paginas:");
        libroCompleto.setNumeroPaginas(scanner.nextInt());
        
        return libroCompleto;

    }

}
