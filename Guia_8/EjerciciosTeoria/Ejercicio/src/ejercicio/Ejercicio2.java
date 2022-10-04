package ejercicio;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        List bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }
        
        bebidas.forEach(elemento -> {
            System.out.println("Bebidas: " + elemento);
        });
    }
}