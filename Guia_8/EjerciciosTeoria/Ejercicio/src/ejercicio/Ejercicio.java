package ejercicio;

import java.util.*;

public class Ejercicio {

    public static void main(String[] args) {
        
        //List -> ArrayList (interface mas utilizada)
        List numeros = new ArrayList();

        numeros.add(84);
        numeros.add(96);
        numeros.add(25);

//        for (Object numero : numeros) {
//            System.out.println("Lista de numeros: " + numero);
//        }
        imprimir(numeros);
        System.out.println("");

        numeros.remove(1);
        //Funcion lamda (forma mejorada)
//        numeros.forEach(numero -> {
//            System.out.println("Lista de numeros despues de eliminar: " + numero);
//        });
        imprimir(numeros);
        System.out.println("");
        

        //Set -> HashSet (interface mas utilizada)
        Set listado = new HashSet();

        listado.add("Alejandro");
        listado.add("Fernando");
        listado.add("Rocio");
//        listado.forEach(elemento -> {
//            System.out.println("listado = " + elemento);
//        });
        imprimir(listado);
        System.out.println("");
        
        listado.remove("Rocio");
        imprimir(listado);
        System.out.println("");
        
        
        //Map -> HashMap (interface mas utilizada)
        Map personas = new HashMap();

        personas.put(34582147, "Roberto Carlos");
        personas.put(37963159, "Marta Sanchez");
        personas.put(42057182, "Juan Perez");

        String elemento = (String) personas.get(37963159);
        System.out.println("elemento = " + elemento);
        System.out.println("");
        
        imprimir(personas.keySet());
        imprimir(personas.values());
        System.out.println("");
        
        personas.remove(34582147);
        imprimir(personas.keySet());
        imprimir(personas.values());

    }

    public static void imprimir(Collection collection) {
        collection.forEach(elemento -> {
            System.out.println("elemento: " + elemento);
        });
    }

}
