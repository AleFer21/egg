package test;

import dni.Dni;
import persona.Persona;

public class Test {

    public static void main(String[] args) {

        Dni d1 = new Dni();
        d1.setNumero(37534831);
        d1.setSerie("Original");

        Persona p1 = new Persona();
        p1.setApellido("Fernandez");
        p1.setNombre("Alejandro");
        p1.setDni(d1);

        System.out.println(p1.toString());

        Dni d2 = new Dni();
        d2.setNumero(34588799);
        d2.setSerie("Copia - A");

        Persona p2 = new Persona();
        p2.setApellido("Perez");
        p2.setNombre("Juan");
        p2.setDni(d2);

        System.out.println(p2.toString());
    }

}
