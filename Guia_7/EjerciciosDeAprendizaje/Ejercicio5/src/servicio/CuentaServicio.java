package servicio;

import cuenta.Cuenta;
import java.util.Scanner;

public class CuentaServicio {

    Scanner scanner = new Scanner(System.in);

    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        System.out.println("Ingresar el numero de cuenta:");
        cuenta.setNumeroCuenta(scanner.nextInt());
        System.out.println("Ingresar el DNI:");
        cuenta.setDni(scanner.nextLong());
        System.out.println("Ingresar el saldo actual:");
        cuenta.setSaldoActual(scanner.nextDouble());
        System.out.println("El numero de cuenata es: " + cuenta.getNumeroCuenta() + ", el DNI es: " + cuenta.getDni() + ", el saldo actual es: " + cuenta.getSaldoActual());
        return cuenta;
    }

    public void ingresar(Cuenta cuenta, double ingreso) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
        System.out.println("Usted ha ingresado: " + ingreso + ", el saldo es: " + cuenta.getSaldoActual());
    }

    public void retirar(Cuenta cuenta, double retiro) {
        if (cuenta.getSaldoActual() < retiro) {
            cuenta.setSaldoActual(0);
            System.out.println("El saldo es: " + cuenta.getSaldoActual());
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.println("Usted ha retirado: " + retiro + ", el saldo es: " + cuenta.getSaldoActual());
        }
    }

    public void extraccionRapida(Cuenta cuenta, double retiro) {
        if (retiro <= (cuenta.getSaldoActual() * 0.20)) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.println("Usted ha retirado: " + retiro + ", y su saldo es: " + cuenta.getSaldoActual());
        } else {
            System.out.println("El monto a retirar excede el limite de extracciones rapidas.");
        }
    }

    public void consultarSaldo(Cuenta cuenta) {
        System.out.println("Su saldo es: " + cuenta.getSaldoActual());
    }

    public void consultarDatos(Cuenta cuenta) {
        System.out.println("El numero de cuenta es: " + cuenta.getNumeroCuenta() + ", el DNI es: " + cuenta.getDni() + ", el saldo actual es: " + cuenta.getSaldoActual());
    }

}
