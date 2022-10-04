package ejercicio17;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor de n");
        int n = leer.nextInt();
        int arreglo[] = new int [n];
        Random r = new Random();
        int numerosUnDigitos = 0;
        int numerosDosDigitos = 0;
        int numerosTresDigitos = 0;
        int numerosCuatroDigitos = 0;
        int numerosCincoDigitos = 0;
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = r.nextInt(99999) + 1;
        }
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("arreglo = [" + arreglo[i] + "]");
        }
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] >= 1 && arreglo[i] <= 9){
                numerosUnDigitos = numerosUnDigitos + 1;
            }
            if(arreglo[i] >= 10 && arreglo[i] <= 99){
                numerosDosDigitos = numerosDosDigitos + 1;
            }
            if(arreglo[i] >= 100 && arreglo[i] <= 999){
                numerosTresDigitos = numerosTresDigitos + 1;
            }
            if(arreglo[i] >= 1000 && arreglo[i] <= 9999){
                numerosCuatroDigitos = numerosCuatroDigitos + 1;
            }
            if(arreglo[i] >= 10000 && arreglo[i] <= 99999){
                numerosCincoDigitos = numerosCincoDigitos + 1;
            }
        }
        System.out.println("En el arrelgo hay " + numerosUnDigitos + " numeros de un digitos");
        System.out.println("En el arrelgo hay " + numerosDosDigitos + " numeros de dos digitos");
        System.out.println("En el arrelgo hay " + numerosTresDigitos + " numeros de tres digitos");
        System.out.println("En el arrelgo hay " + numerosCuatroDigitos + " numeros de cuatro digitos");
        System.out.println("En el arrelgo hay " + numerosCincoDigitos + " numeros de cinco digitos");
    }
    
}
