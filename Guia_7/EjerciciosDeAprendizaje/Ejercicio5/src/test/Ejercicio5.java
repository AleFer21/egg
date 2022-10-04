package test;

import cuenta.Cuenta;
import servicio.CuentaServicio;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        CuentaServicio cs = new CuentaServicio();
        Cuenta c1 = cs.crearCuenta();
        cs.ingresar(c1, 20000);
        cs.retirar(c1, 5000);
        cs.extraccionRapida(c1, 12000);
        cs.consultarSaldo(c1);
        cs.consultarDatos(c1);
        
    }
    
}
