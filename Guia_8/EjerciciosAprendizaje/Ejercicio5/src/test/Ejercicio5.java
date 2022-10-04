package test;

import servicio.PaisesServicio;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        PaisesServicio ps = new PaisesServicio();
        ps.crearPaises();
        ps.mostrarPaises();
        ps.eliminarPais();
        ps.mostrarPaises();
        
    }
    
}
