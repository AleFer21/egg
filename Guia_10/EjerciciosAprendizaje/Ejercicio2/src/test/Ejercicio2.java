package test;

import entidades.*;
import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        //PADRE
        Electrodomestico electrodomestico = new Electrodomestico();
        electrodomestico.crearElectrodomestico();
//        electrodomestico.precioFinal(electrodomestico);
//        System.out.println(electrodomestico.toString());
        
        //HIJOS
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        
        Lavadora lavadora2 = new Lavadora();
        lavadora2.crearLavadora();
//        lavadora.precioFinal(lavadora);
//        System.out.println(lavadora.toString());
//        
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
//        televisor.precioFinal(televisor);
//        System.out.println(televisor.toString());

        //EJERCICIO 3
        
        List<Electrodomestico> electrodomesticos = new ArrayList();
        electrodomesticos.add(electrodomestico);
        electrodomesticos.add(lavadora);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(televisor);
        
        electrodomesticos.forEach(elemento -> {
            System.out.println(elemento);
        });
        
        
    }

}
