package test;

import operacion.Operacion;
import servicio.OperacionServicio;

public class Ejercicio3 {

    public static void main(String[] args) {

        OperacionServicio ops = new OperacionServicio();
        Operacion op = ops.crearOperacion();
        ops.sumar(op);
        ops.restar(op);
        ops.multiplicar(op);
        ops.dividir(op);

    }

}
