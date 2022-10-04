package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;
        do{
            System.out.println("Ingrese un numero:");
            numero = leer.nextInt();
            suma = suma + numero;
            contador++;
            if(numero == 0){
                System.out.println("Se capturó el numero cero.");
                break;
            }
        } while(contador < 20);
        System.out.println("La suma de los numeros ingresados es: " + suma);

    }
    
}
