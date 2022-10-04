package servicio;

import java.util.*;
import pelicula.Pelicula;
import utilidades.Comparadores;

public class PeliculaServicio {

    private Scanner scanner;
    private List<Pelicula> peliculas;

    public PeliculaServicio() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
        this.peliculas = new ArrayList<>();
    }

    public Pelicula crearPeliculas() {
        Pelicula pelicula = new Pelicula();
        String respuesta;
        do {
            System.out.println("Ingrese el titulo de la pelicula:");
            String titulo = scanner.next();
            System.out.println("Ingrese el director de la pelicula:");
            String director = scanner.next();
            System.out.println("Ingrese la duracion de la pelicula (Ej: 1,36 horas):");
            double duracion = scanner.nextDouble();
            pelicula = new Pelicula(titulo, director, duracion);
            peliculas.add(pelicula);
            System.out.println("Desea agregar otra pelicula? Si/No");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("si"));
        return pelicula;
    }

    public void mostrarPeliculas() {
        System.out.println("Las peliculas son:");
        peliculas.forEach(pelicula -> {
            System.out.println(pelicula.toString());
        });
    }

    public void masDeUnaHora() {
        List<Pelicula> masUnaHora = new ArrayList();
        System.out.println("Las peliculas que duran mas de una hora son:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                masUnaHora.add(pelicula);
            }
        }
        System.out.println(masUnaHora);
    }
    
    public void ordenarDuracionMayorMenor(){
        System.out.println("Peliculas ordenadas de mayor a menor:");
        Collections.sort(peliculas, Comparadores.ordenarDuracionDesc);
        peliculas.forEach(pelicula -> {
            System.out.println(pelicula.toString());
        });
    }
    
    public void ordenarDuracionMenorMayor(){
        System.out.println("Peliculas ordenadas de menor a mayor:");
        Collections.sort(peliculas, Comparadores.ordenarDuracionDesc.reversed());
        peliculas.forEach(pelicula -> {
            System.out.println(pelicula.toString());
        });
    }
    
    public void ordenarTitulo(){
        System.out.println("Las peliculas ordenadas por titulo:");
        Collections.sort(peliculas, Comparadores.ordenarTituloDesc.reversed());
        peliculas.forEach(pelicula -> {
            System.out.println(pelicula.toString());
        });
    }
    
    public void ordenarDirector(){
        System.out.println("Peliculas ordenadas por director:");
        Collections.sort(peliculas, Comparadores.ordenarDirectorDesc.reversed());
        peliculas.forEach(pelicula -> {
            System.out.println(pelicula.toString());
        });
    }

}
