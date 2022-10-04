package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        double numero = leer.nextInt();
        double doble = numero * 2;
        double triple = numero * 3;
        double raiz = Math.sqrt(numero);
        System.out.println("El doble es: " + doble);
        System.out.println("El triple es: " + triple);
        System.out.println("La raiz es: " + raiz);
        
    }
    
}
