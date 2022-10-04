package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        System.out.println("Ingrese el monto a convertir:");
        Scanner leer = new Scanner(System.in);
        double monto = leer.nextDouble();

        System.out.println(monto + " libras son " + convertirLibras(monto) + " €.");
        System.out.println(monto + " pesos son " + convertirPesos(monto) + " €.");
        System.out.println(monto + " yenes son " + convertirYenes(monto) + " €.");

    }

    public static double convertirLibras(double monto) {
        double libras = monto / 0.86;
        return libras;
    }
    
    public static double convertirPesos(double monto) {
        double pesos = monto / 1.28611;
        return pesos;
    }
    
    public static double convertirYenes(double monto) {
        double yenes = monto / 129.852;
        return yenes;
    }

}
