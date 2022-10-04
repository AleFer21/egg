package test;

import services.PPService;

public class Test {
    
    public static void main(String[] args) {
        
        PPService pps = new PPService();
        
        pps.crearPersona();
        pps.mostrarPersonas();

        pps.crearPerro();
        pps.mostrarPerros();
        
        pps.adoptarPerro();

           
    }
    
}
