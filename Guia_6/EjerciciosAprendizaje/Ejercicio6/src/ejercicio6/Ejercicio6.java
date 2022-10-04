package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para determinar si par o impar:");
        int numero = leer.nextInt();
        if(numero % 2 == 0){
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
        
    }
    
}
