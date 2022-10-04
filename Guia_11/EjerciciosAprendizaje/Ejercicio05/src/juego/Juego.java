package juego;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {

    Scanner scanner = new Scanner(System.in);

    public void adivinar() throws InputMismatchException, NumberFormatException {

        int contador = 0;
        int aleatorio = (int) (Math.random() * 500 + 1);
        System.out.println("Ingrese un nuemro entre el 1 y el 500");
        int num = scanner.nextInt();
        while (num != aleatorio) {
            if (num < aleatorio) {
                System.out.println("El numero ingresado es mas chico que el numero misterioso, ingrese un numero mas grande:");
                num = scanner.nextInt();
            } else if (num > aleatorio) {
                System.out.println("El numero ingresado es mas grande que el numero misterioso, ingrese un numero mas chico:");
                num = scanner.nextInt();
            } else if (num == aleatorio) {
                System.out.println("Felicidades has acertado!");
            }
        }
        System.out.println("El numero misterioso era: " + aleatorio);

    }

}
