package test;

import division.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        DivisionNumero dn = new DivisionNumero();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numerador:");
        String num = scanner.next();
        System.out.println("Ingrese el divisor:");
        String div = scanner.next();

        try {
            int numerador = Integer.parseInt(num);
            int divisor = Integer.parseInt(div);
            System.out.println(dn.division(numerador, divisor));
        } catch (ArithmeticException a) {
            System.out.println("ERROR: Division por cero.");
        } catch (NumberFormatException n) {
            System.out.println("ERROR: El numero ingresado no es un entero.");
        } catch (InputMismatchException i) {
            System.out.println("ERROR: El dato ingresado no es de tipo integer.");
        } finally {
            System.out.println("Saliendo del try..");
        }

    }

}
