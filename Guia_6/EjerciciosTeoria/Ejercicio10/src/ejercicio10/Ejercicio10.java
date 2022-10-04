package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numero;
        int contador = 0;
        do{
            System.out.println("Ingrese un numero:");
            numero = leer.nextInt();
            contador++;
            System.out.print(numero + " ");
            for(int i = 0; i < numero; i++){
                System.out.print(" * ");
            }
            System.out.println("");
        } while(contador < 4);
    }
    
}
