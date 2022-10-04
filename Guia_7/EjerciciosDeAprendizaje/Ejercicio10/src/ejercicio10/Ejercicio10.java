package ejercicio10;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        double arregloA [] = new double [50];
        double arregloB [] = new double [20];
        
        for(int i = 0; i < 50; i++){
            arregloA[i] = Math.random() * 100;
        }
        
        Arrays.sort(arregloA);
        
        for(int i = 0; i < 50; i++){
            System.out.println("arregloA[" + i + "]: [" + arregloA[i] + "]");
        }
        
        for(int i = 0; i < 10; i++){
            arregloB[i] = arregloA[i];
        }
        
        for(int i = 10; i < 20; i++){
            arregloB[i] = 0.5;
        }
        
        for(int i = 0; i < 20; i++){
            System.out.println("arregloB[" + i + "]: [" + arregloB[i] + "]");
        }
        
    }
    
}
