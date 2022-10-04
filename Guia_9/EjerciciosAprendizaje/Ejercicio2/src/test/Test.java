package test;

import juego.Juego;
import revolver.Revolver;


public class Test {
    
    public static void main(String[] args) {
        
        Juego j = new Juego(6);
        Revolver r = new Revolver();
        while( !j.finJuego() ){
            System.out.println(r.toString());
            j.ronda();            
        }
        
        System.out.println("El juego ha terminado");
        
    }
    
}
