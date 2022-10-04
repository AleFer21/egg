package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero 1:");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese numero 2:");
        int numero2 = leer.nextInt();
        if(numero1 > 25 && numero2 > 25){
            System.out.println("Ambos numeros son mayores a 25.");
        } else if(numero1 > 25){
            System.out.println("Solo el numero 1 es mayor a 25.");
        } else if(numero2 > 25){
            System.out.println("Solo el numero 2 es mayor a 25.");
        } else {
            System.out.println("Ninguno de los numeros es mayor a 25.");
        }
        
    }
    
}
