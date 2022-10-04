package test;

import perro.Perro;
import persona.Persona;

public class Test {

    public static void main(String[] args) {

        Perro perro1 = new Perro("Firulais", "Beagle", 5, "Mediano");
        Persona persona1 = new Persona("Alejandro", "Fernandez", 29, 3855896, perro1);

        Perro perro2 = new Perro("Tifon", "Pug", 4, "Chico");
        Persona persona2 = new Persona("Juan", "Perez", 32, 36871478, perro2);

        persona1.mostrarPersona();
        persona2.mostrarPersona();

    }

}
