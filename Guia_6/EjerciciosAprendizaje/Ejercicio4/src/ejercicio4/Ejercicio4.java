package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados Celcius:");
        double celcius = leer.nextDouble();
        double fahrenheit = 32 + (9 * celcius / 5);
        System.out.println(celcius + "° C son " + fahrenheit + "F.");
    }
    
}
