package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra:");
        String cadena = leer.nextLine();
        if(cadena.equals("A") || cadena.equals("a")){
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
        
    }
    
}
