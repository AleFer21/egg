package servicio;

import java.util.Scanner;
import rectangulo.Rectangulo;

public class RectanguloServicio {

    Scanner scanner = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Ingrese la altura:");
        rectangulo.setAltura(scanner.nextDouble());
        System.out.println("Ingrese la base:");
        rectangulo.setBase(scanner.nextDouble());
        System.out.println("La altura es: " + rectangulo.getAltura() + ", la base es: " + rectangulo.getBase());
        return rectangulo;
    }

    public void superficie(Rectangulo rectangulo) {
        double superficie = rectangulo.getBase() * rectangulo.getAltura();
        System.out.println("La superficie es: " + superficie);
    }

    public void perimetro(Rectangulo rectangulo) {
        double perimetro = (rectangulo.getBase() + rectangulo.getAltura()) * 2;
        System.out.println("El perimetro es: " + perimetro);
    }

    public void dibujarRectangulo(Rectangulo rectangulo) {
        for (int i = 1; i <= rectangulo.getBase(); i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 1; i <= rectangulo.getAltura() - 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= rectangulo.getBase() - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= rectangulo.getBase(); i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
