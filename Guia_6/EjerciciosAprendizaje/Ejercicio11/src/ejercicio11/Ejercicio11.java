package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros:");
                int numero1 = leer.nextInt();
                int numero2 = leer.nextInt();
        System.out.println("MENU"
                + "\n1.Sumar"
                + "\n2.Restar"
                + "\n3.Multiplicar"
                + "\n4.Dividir"
                + "\n5.Salir"
                + "\nElija opcion:");
        int opciones = leer.nextInt();
        switch(opciones){
            case 1:
                int suma = numero1 + numero2;
                System.out.println("La suma es: " + suma);
                break;
            case 2:
                int resta = numero1 - numero2;
                System.out.println("La resta es: " + resta);
                break;
            case 3:
                int multiplicacion = numero1 * numero2;
                System.out.println("La multiplicacion es: " + multiplicacion);
                break;
            case 4:
                int division = numero1 / numero2;
                System.out.println("La division es: " + division);
                break;
            case 5:
                System.out.println("Usted ha salido del programa.");
                break;
        }
    }
    
}
