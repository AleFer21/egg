package aprendizajeextra;

import java.util.*;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 0 y 100");
        int numero = leer.nextInt();
        int r1 = (int) (Math.random() * 10);
        int r2 = (int) (Math.random() * 10);
        int multiplicacion = r1 * r2;
        //System.out.println(r1 + " * " + r2 + " = " + multiplicacion);
        while (multiplicacion != numero) {
            System.out.println("Ingrese un numero entre 0 y 100");
            numero = leer.nextInt();
        }
        if(multiplicacion == numero){
            System.out.println("Ha acertado, el numero oculto es: " + multiplicacion);
        }
    }

}
