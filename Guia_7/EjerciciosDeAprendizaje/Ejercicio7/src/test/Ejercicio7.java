package test;

import persona.Persona;
import servicio.PersonaServicio;

public class Ejercicio7 {

    public static void main(String[] args) {

        PersonaServicio ps1 = new PersonaServicio();
        Persona persona1 = null;
//        System.out.println(persona1.toString());
//        Persona persona1 = ps1.crearPersona();
//        System.out.println("El IMC de " + persona1.getNombre() + " es: " + ps1.calcularIMC(persona1));
        try {
            ps1.esMayorDeEdad(persona1);
        } catch (NullPointerException n) {
            System.out.println("La persona no existe");
        }
//        System.out.println(persona1.getNombre() + " es mayor de edad? " + ps1.esMayorDeEdad(persona1));

//        PersonaServicio ps2 = new PersonaServicio();
//        Persona persona2 = ps2.crearPersona();
//        System.out.println("El IMC de " + persona2.getNombre() + " es: " + ps2.calcularIMC(persona2));
//        System.out.println(persona2.getNombre() + " es mayor de edad? " + ps2.esMayorDeEdad(persona2));
//
//        PersonaServicio ps3 = new PersonaServicio();
//        Persona persona3 = ps3.crearPersona();
//        System.out.println("El IMC de " + persona3.getNombre() + " es: " + ps3.calcularIMC(persona3));
//        System.out.println(persona3.getNombre() + " es mayor de edad? " + ps3.esMayorDeEdad(persona3));
//
//        PersonaServicio ps4 = new PersonaServicio();
//        Persona persona4 = ps4.crearPersona();
//        System.out.println("El IMC de " + persona4.getNombre() + " es: " + ps4.calcularIMC(persona4));
//        System.out.println(persona4.getNombre() + " es mayor de edad? " + ps4.esMayorDeEdad(persona4));
//
//        double promedio = (ps1.calcularIMC(persona1) + ps2.calcularIMC(persona2) + ps3.calcularIMC(persona3) + ps4.calcularIMC(persona4)) / 4;
//        System.out.println("El promedio de IMC es: " + promedio);
    }

}
