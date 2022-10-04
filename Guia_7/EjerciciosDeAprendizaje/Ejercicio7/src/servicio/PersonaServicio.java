package servicio;

import java.util.Scanner;
import persona.Persona;

public class PersonaServicio {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.next();
        System.out.println("Ingrese la edad de la persona:");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el sexo de la persona:\n" + "Hombre: H\n" + "Mujer: M\n" + "Otro: O");
        String sexo = scanner.next().toUpperCase();
        if (sexo != "H" || sexo != "M" || sexo != "O") {
            System.out.println("Valor incorrecto, ingrese de nuevo:\n" + "Hombre: H\n" + "Mujer: M\n" + "Otro: O");
            sexo = scanner.next().toUpperCase();
        }
        System.out.println("Ingrese el peso de la persona:");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese la altura de la persona:");
        double altura = scanner.nextDouble();
        persona = new Persona(nombre, edad, sexo, peso, altura);
        return persona;
    }

    public double calcularIMC(Persona persona) {
        double imc = persona.getPeso() / (persona.getAltura() * persona.getAltura());
        double valorRetorno = 2;
        if (imc < 20) {
            valorRetorno = -1;
        } else if (imc > 20 && imc <= 25) {
            valorRetorno = 0;
        } else if (imc > 25) {
            valorRetorno = 1;
        }
        return valorRetorno;
    }

    public boolean esMayorDeEdad(Persona persona) throws NullPointerException {
        boolean bandera = false;
        if (persona.getEdad() >= 18) {
            bandera = true;
        } else {
            bandera = false;
        }
        return bandera;
    }

}
