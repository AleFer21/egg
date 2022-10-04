package test;

import ahorcado.Ahorcado;
import servicio.AhorcadoServicio;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        AhorcadoServicio ahs = new AhorcadoServicio();
        
        Ahorcado ah1 = ahs.crearJuego();
        ahs.buscar(ah1, 's');
        ahs.buscar(ah1, 'e');
        ahs.buscar(ah1, 'f');
        ahs.buscar(ah1, 'u');
        ahs.buscar(ah1, 'c');
        ahs.encontradas(ah1, 's');
        ahs.encontradas(ah1, 'e');
        ahs.intentos(ah1);
        
        
        
    }
    
}
