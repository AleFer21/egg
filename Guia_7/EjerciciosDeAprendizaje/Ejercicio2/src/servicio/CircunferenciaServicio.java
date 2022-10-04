package servicio;

import circunferencia.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicio {

    Scanner scanner = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {
        Circunferencia circunferencia = new Circunferencia();
        System.out.println("Ingrese el radio:");
        circunferencia.setRadio(scanner.nextDouble());
        System.out.println("El radio es: " + circunferencia.getRadio());
        return circunferencia;
    }

    public double area(Circunferencia circunferencia) {
        double area = 3.14 * circunferencia.getRadio() * circunferencia.getRadio();
        System.out.println("El area es: " + area);
        return area;
    }

    public double perimetro(Circunferencia circunferencia) {
        double perimetro = 2 * 3.14 * circunferencia.getRadio();
        System.out.println("El perimetro es: " + perimetro);
        return perimetro;
    }

}
