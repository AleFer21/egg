package test;

import division.DivisionNumero;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        DivisionNumero dn = new DivisionNumero();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numerador:");
        String n = scanner.next();
        int numerador = Integer.parseInt(n);
        System.out.println("Ingrese el divisor:");
        String d = scanner.next();
        int divisor = Integer.parseInt(d);

        try {
            System.out.println(dn.division(numerador, divisor));
        } catch (ArithmeticException a) {
            System.out.println("ERRO: Division por cero.");
        }

    }

}
