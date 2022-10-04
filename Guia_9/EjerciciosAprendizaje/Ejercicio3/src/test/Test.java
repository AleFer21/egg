package test;

import services.BarajaService;

public class Test {
    
    public static void main(String[] args) {
        
        BarajaService bs = new BarajaService();
        
        bs.crearBaraja();
        bs.mostrarBaraja();
        bs.barajar();
        bs.darCartas();
        bs.siguienteCarta();
        
    }
    
}
