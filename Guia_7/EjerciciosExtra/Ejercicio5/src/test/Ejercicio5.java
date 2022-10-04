package test;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String mesSecreto = meses[5];
        System.out.println("Ingrese un mes aleatorio:");
        String mesAleatorio = scanner.next();
        while (!mesSecreto.equals(mesAleatorio)) {
            System.out.println("Fallaste! Ingrese un mes aleatorio de nuevo:");
            mesAleatorio = scanner.next();
        }
        System.out.println("Acertaste! El mes secreto era: " + mesSecreto);
    }

}
