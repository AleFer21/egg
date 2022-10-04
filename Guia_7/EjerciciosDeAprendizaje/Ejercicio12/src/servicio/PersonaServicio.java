package servicio;

import java.util.*;
import persona.Persona;

public class PersonaServicio {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre:");
        persona.setNombre(scanner.next());
        System.out.println("Ingrese el dia de nacimiento:");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes de nacimiento:");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año de nacimiento:");
        int anio = scanner.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        persona.setFechaNacimiento(fecha);
        return persona;
    }

    public int calcularEdad(Persona persona) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - persona.getFechaNacimiento().getYear();
        return edad;
    }

    public boolean menorQue(Persona persona, int edad) {
        boolean bandera = false;
        if (calcularEdad(persona) < edad) {
            bandera = true;
        } else {
            bandera = false;
        }
        return bandera;
    }

    public void motrarPersona(Persona persona) {
        System.out.println(persona.toString());
    }

}
