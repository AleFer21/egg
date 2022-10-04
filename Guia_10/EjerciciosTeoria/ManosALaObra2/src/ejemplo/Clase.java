package ejemplo;

import java.util.Scanner;

public class Clase implements ClaseInterface {

    @Override
    public void saludar() {
        System.out.println("Hola Mundo!");
    }

    @Override
    public int sumar() {
        int suma = 8 + 6;
        return suma;
    }
    
}
