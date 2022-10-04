package test;

import entidades.*;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo(3d, 6d);
        Circulo circulo2 = new Circulo(5d, 10d);
        
        Rectangulo rectangulo1 = new Rectangulo(5d, 9d);
        Rectangulo rectangulo2 = new Rectangulo(10d, 45d);
        
        System.out.println("El perimetro del circulo1 es: " + circulo1.calcularPerimetro());
        System.out.println("El area del circulo1 es: " + circulo1.calcularArea());
        System.out.println("");
        
        System.out.println("El perimetro del circulo2 es: " + circulo2.calcularPerimetro());
        System.out.println("El area del circulo2 es: " + circulo2.calcularArea());
        System.out.println("");
        
        System.out.println("El perimetro del rectangulo1 es: " + rectangulo1.calcularPerimetro());
        System.out.println("El area del rectangulo1 es: " + rectangulo1.calcularArea());
        System.out.println("");
        
        System.out.println("El perimetro del rectangulo2 es: " + rectangulo2.calcularPerimetro());
        System.out.println("El area del rectangulo2 es: " + rectangulo2.calcularArea());
        System.out.println("");
        
    }
    
}
