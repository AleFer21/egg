package aprendizajeextra;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = leer.nextInt();
        esPrimo(numero);

    }

    public static void esPrimo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador != 2) {
            System.out.println("El numero no es primo.");
        } else {
            System.out.println("El numero es primo.");
        }
    }

}
