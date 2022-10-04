package aprendizajeextra;

import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        int dividendo, divisor, resta, contador;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del dividendo:");
        dividendo = leer.nextInt();
        System.out.println("Ingrese el valor de divisor:");
        divisor = leer.nextInt();
        resta = dividendo - divisor;
        contador = 1;
        while(resta >= divisor){
            contador++;
            resta = resta - divisor;
        }
        
        System.out.println("El residuo es " + resta + " y el cociente es " + contador);
        
    }
}
