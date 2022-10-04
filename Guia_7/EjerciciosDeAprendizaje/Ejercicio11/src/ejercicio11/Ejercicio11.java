package ejercicio11;

import java.util.*;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        int dia;
        int mes;
        int anio;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el dia del nacimiento:");
        dia = scanner.nextInt();
        System.out.println("Ingrese el mes del nacimiento:");
        mes = scanner.nextInt();
        mes = mes - 1;
        System.out.println("Ingrese el año del nacimiento:");
        anio = scanner.nextInt();
        
        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();
        int anioActual = fechaActual.getYear();
        System.out.println("La fecha de nacimiento es: " + fecha.toString());
        System.out.println("La fecha acutal es: " + fechaActual.toString());
        System.out.println("Los años de diferencia son: " + (anioActual - anio));
        
    }
    
}
