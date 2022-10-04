package test;

import circunferencia.Circunferencia;
import servicio.CircunferenciaServicio;

public class Ejercicio2 {

    public static void main(String[] args) {

        CircunferenciaServicio radioS1 = new CircunferenciaServicio();
        Circunferencia radioC1 = radioS1.crearCircunferencia();

        radioS1.area(radioC1);
        radioS1.perimetro(radioC1);

    }

}
