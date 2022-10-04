package ejercicio18;

import java.util.Random;

public class Ejercicio18 {

    public static void main(String[] args) {
        
        int matriz[][] = new int [4][4];
        Random r = new Random();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matriz[i][j] = r.nextInt(9) + 1;
            }
        }
        System.out.println("Matriz Original:");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("Matriz Traspuesta:");
        for(int j = 0; j < 4; j++){
            for(int i = 0; i < 4; i++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
