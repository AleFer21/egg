package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int [3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Ingrese un valor del 1 al 9:");
                int numeros = leer.nextInt();
                matriz[i][j] = numeros;
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }
    }
    
}
