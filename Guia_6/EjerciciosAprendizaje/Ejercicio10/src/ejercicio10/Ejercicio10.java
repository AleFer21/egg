package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor limite:");
        int limite = leer.nextInt();
        int numeros = 0;
        int suma = 0;
        while(suma <= limite){
            System.out.println("Ingrese numeros:");
            numeros = leer.nextInt();
            suma = suma + numeros;
        }
        System.out.println("La suma es: " + suma);
    }
    
}
