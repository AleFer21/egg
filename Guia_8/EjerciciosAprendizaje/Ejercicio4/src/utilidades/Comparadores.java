package utilidades;

import java.util.Comparator;
import pelicula.Pelicula;

public class Comparadores {

    public static Comparator<Pelicula> ordenarDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenarTituloDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getTitulo().compareTo(o1.getTitulo());
        }
    };

    public static Comparator<Pelicula> ordenarDirectorDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDirector().compareTo(o1.getDirector());
        }
    };

}
