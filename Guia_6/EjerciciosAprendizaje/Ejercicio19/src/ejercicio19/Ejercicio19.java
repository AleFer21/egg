package ejercicio19;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n, m;
        System.out.println("Ingrese el valor de las filas:");
        n = leer.nextInt();
        System.out.println("Ingrese el valor de las columnas:");
        m = leer.nextInt();

        int matriz[][] = new int[n][m];
        Random r = new Random();
        boolean simetrica = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = r.nextInt(9) + 1;
            }
        }

        System.out.println("Matriz Original:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("Matriz Traspuesta:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }

        if (n == m) {
            int i, j;
            i = 0;
            while (i < n && simetrica == true) {
                j = 0;
                while (j < i && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
        }

        if (simetrica == true) {
            System.out.println("La matriz es simetrica.");
        } else {
            System.out.println("La matriz es anti-simetrica.");
        }
    }

}
