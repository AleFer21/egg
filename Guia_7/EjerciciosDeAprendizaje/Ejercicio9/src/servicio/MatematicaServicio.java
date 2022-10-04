package servicio;

import static java.lang.Math.abs;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import matematica.Matematica;

public class MatematicaServicio {

    public double devolverMayor(Matematica matematica) {
        double mayor;
        if (matematica.getNum1() > matematica.getNum2()) {
            mayor = matematica.getNum1();
        } else {
            mayor = matematica.getNum2();
        }
        return mayor;
    }

    public void calcularPotencia(Matematica matematica) {
        double potencia = round(devolverMayor(matematica)) * round(devolverMayor(matematica));
        System.out.println("La potencia del mayor de los numeros es: " + potencia);
    }

    public void calcularRaiz(Matematica matematica) {
        double menor;
        if (matematica.getNum1() < matematica.getNum2()) {
            menor = matematica.getNum1();
        } else {
            menor = matematica.getNum2();
        }
        double raiz = sqrt(abs(menor));
        System.out.println("La raiz del menor de los numeros es: " + raiz);
    }

}
