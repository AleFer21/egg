package servicio;

import java.util.Scanner;
import operacion.Operacion;

public class OperacionServicio {

    Scanner scanner = new Scanner(System.in);

    public Operacion crearOperacion() {
        Operacion operacion = new Operacion();
        System.out.println("Ingrese el primer numero:");
        operacion.setNumero1(scanner.nextDouble());
        System.out.println("Ingrese el segundo numero:");
        operacion.setNumero2(scanner.nextDouble());
        System.out.println("El numero 1 es: " + operacion.getNumero1() + ", el numero 2 es: " + operacion.getNumero2());
        return operacion;
    }

    public void sumar(Operacion operacion) {
        double suma = operacion.getNumero1() + operacion.getNumero2();
        System.out.println("La suma es: " + suma);
    }

    public void restar(Operacion operacion) {
        double resta = operacion.getNumero1() - operacion.getNumero2();
        System.out.println("La resta es: " + resta);
    }

    public void multiplicar(Operacion operacion) {
        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            System.out.println("ERROR: uno de los numeros es 0 por lo que el resultado de la multiplicacion es 0");
        } else {
            double multplicacion = operacion.getNumero1() * operacion.getNumero2();
            System.out.println("La multiplicacion es: " + multplicacion);
        }
    }

    public void dividir(Operacion operacion) {
        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            System.out.println("ERROR: uno de los numeros es 0 por lo que el resultado de la division es 0");
        } else {
            double division = operacion.getNumero1() / operacion.getNumero2();
            System.out.println("La division es: " + division);
        }
    }

}
