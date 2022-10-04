package servicio;

import java.util.Scanner;
import raices.Raices;

public class RaicesServicio {

    Scanner scanner = new Scanner(System.in);

    public Raices coeficientes() {
        Raices raices = new Raices();
        System.out.println("Ingrese el valor de 'a':");
        raices.setA(scanner.nextDouble());
        System.out.println("Ingrese el valor de 'b':");
        raices.setB(scanner.nextDouble());
        System.out.println("Ingrese el valor de 'c':");
        raices.setC(scanner.nextDouble());
        return raices;
    }

    public double getDiscriminante(Raices raices) {
        double discriminante = (raices.getB() * raices.getB()) - 4 * raices.getA() * raices.getC();
        return discriminante;
    }

    public boolean tieneRaices(Raices raices) {
        boolean bandera = false;
        if (getDiscriminante(raices) > 0) {
            bandera = true;
        } else {
            bandera = false;
        }
        return bandera;
    }

    public boolean tieneRaiz(Raices raices) {
        boolean bandera = false;
        if (getDiscriminante(raices) == 0) {
            bandera = true;
        } else {
            bandera = false;
        }
        return bandera;
    }

    public void obtenerRaices(Raices raices) {
        if (tieneRaices(raices) == true) {
            double x1 = (-raices.getB() + Math.sqrt((raices.getB() * raices.getB()) - 4 * raices.getA() * raices.getC())) / 2 * raices.getA();
            double x2 = (-raices.getB() - Math.sqrt((raices.getB() * raices.getB()) - 4 * raices.getA() * raices.getC())) / 2 * raices.getA();
            System.out.println("Las raices son, x1= " + x1 + " y x2= " + x2);
        } else {
            System.out.println("ERROR: el discriminante es negativo, no se pueden calcular las raices.");
        }
    }

    public void obtenerRaiz(Raices raices) {
        if (tieneRaiz(raices) == true) {
            double x = -raices.getB() / 2 * raices.getA();
            System.out.println("La raiz es x= " + x);
        } else {
            System.out.println("ERROR: el discriminante es negativo, no se pueden calcular las raices.");
        }
    }

}
