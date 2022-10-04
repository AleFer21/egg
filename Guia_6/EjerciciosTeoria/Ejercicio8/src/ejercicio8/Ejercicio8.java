package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota:");
        int nota = leer.nextInt();
        while(nota <= 0 || nota >= 10){
            System.out.println("Ingrese la nota de nuevo:");
            nota = leer.nextInt();
        }
    }
    
}
