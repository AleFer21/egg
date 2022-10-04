package ejercicio21;

import java.util.*;

public class Ejercicio21 {

    public static void main(String[] args) {

        int matriz1[][] = new int[10][10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz1[i][j] = r.nextInt(99) + 1;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matriz1[i][j] + "]");
            }
            System.out.println("");
        }
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz:");
        int n = leer.nextInt();
        int matriz2[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese los valores de la matriz");
                int num = leer.nextInt();
                matriz2[i][j] = num;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz2[i][j] + "]");
            }
            System.out.println("");
        }
        boolean contenida = false;
        int i, j;
        i = 0;
        while (i < 10 && contenida == false) {
            j = 0;
            while (j < i && contenida == false) {
                if (matriz1[i][j] != matriz2[j][i]) {
                    contenida = true;
                }
                j++;
            }
            i++;
        }
        if (contenida == true) {
            System.out.println("La matriz2 esta contenida en la matriz1.");
        } else {
            System.out.println("La matriz2 esta  NO contenida en la matriz1.");
        }
    }

}
