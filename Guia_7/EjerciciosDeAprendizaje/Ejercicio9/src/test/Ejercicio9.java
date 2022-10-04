package test;

import matematica.Matematica;
import servicio.MatematicaServicio;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        MatematicaServicio ms = new MatematicaServicio();
        Matematica parDeNumeros1 = new Matematica(Math.random() * 100, Math.random() * 100);
        System.out.println(parDeNumeros1.toString());
        ms.devolverMayor(parDeNumeros1);
        ms.calcularPotencia(parDeNumeros1);
        ms.calcularRaiz(parDeNumeros1);

    }

}
