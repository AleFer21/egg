package test;

import servicio.PeliculaServicio;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        PeliculaServicio ps = new PeliculaServicio();
        ps.crearPeliculas();
        ps.mostrarPeliculas();
        ps.masDeUnaHora();
        ps.ordenarDirector();
        ps.ordenarTitulo();
        ps.ordenarDuracionMayorMenor();
        ps.ordenarDuracionMenorMayor();
        
    }

}
