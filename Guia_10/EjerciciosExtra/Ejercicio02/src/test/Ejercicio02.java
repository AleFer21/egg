package test;

import edificio.*;
import java.util.*;

public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        Polideportivo p1 = new Polideportivo("Malvinas", "Techado", 30, 50, 50);
        Polideportivo p2 = new Polideportivo("Don Julian", "Abierto", 10, 100, 200);
        EdificioDeOficinas e1 = new EdificioDeOficinas(2, 10, 10, 40, 20, 30);
        EdificioDeOficinas e2 = new EdificioDeOficinas(4, 25, 20, 70, 40, 50);
        
        List<Edificio> edificios = new ArrayList();
        edificios.add(p1);
        edificios.add(p2);
        edificios.add(e1);
        edificios.add(e2);
        edificios.forEach(elemento -> {
            System.out.println(elemento);
        });
        System.out.println("");
        
        p1.calcularSuperficie();
        p1.calcularVolumen();
        System.out.println("");
        
        p2.calcularSuperficie();
        p2.calcularVolumen();
        System.out.println("");
        
        e1.calcularSuperficie();
        e1.calcularVolumen();
        e1.cantPersonas();
        System.out.println("");
        
        e2.calcularSuperficie();
        e2.calcularVolumen();
        e2.cantPersonas();
        System.out.println("");
        
    }
    
}
