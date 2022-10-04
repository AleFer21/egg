package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero 1:");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el numero 2:");
        int numero2 = leer.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);
        
    }
    
}
