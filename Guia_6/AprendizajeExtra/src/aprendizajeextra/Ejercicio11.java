package aprendizajeextra;

import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = leer.nextInt();
        String num = Integer.toString(numero);
        System.out.println("El numero " + numero + " tiene " + num.length() + " digitos.");
    }
    
}
