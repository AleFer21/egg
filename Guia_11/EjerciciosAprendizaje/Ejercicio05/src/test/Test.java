package test;

import java.util.InputMismatchException;
import juego.Juego;

public class Test {

    public static void main(String[] args) {

        Juego j = new Juego();

        try {
            j.adivinar();
        } catch (Exception e) {
            System.out.println("El valor ingresado no es un entero.");
        }
    }
}
