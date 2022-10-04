package test;

import entidades.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        Animal perro1 = new Perro("Tifon", "Dogchow", 8, "Pug");
        perro1.alimentarse();
        System.out.println(perro1.toString());

        Animal perro2 = new Perro("Sadam", "Pedigree", 6, "Golden");
        perro2.alimentarse();
        System.out.println(perro2.toString());

        Animal gato = new Gato("Garfield", "Lasagna", 4, "Naranjoso");
        gato.alimentarse();
        System.out.println(gato.toString());

        Animal caballo = new Caballo("Huracan", "Pasto", 7, "Mustang");
        caballo.alimentarse();
        System.out.println(caballo.toString());
    }

}
