package test;

import puntos.Puntos;
import servicio.PuntosServicio;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        PuntosServicio ps = new PuntosServicio();
        Puntos p1 = ps.crearPuntos();
        
        ps.distanciaEntrePuntos(p1);
        
    }
    
}
