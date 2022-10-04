package ejercicio1;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        List<String> perros = new ArrayList<>();
        String decision;
        do {
            System.out.println("Ingrese una raza de perro:");
            String raza = scanner.next();
            perros.add(raza);
            System.out.println("Desea continuar? Si/No");
            decision = scanner.next().toLowerCase();
        } while (!decision.equals("no"));

        perros.forEach(elemento -> {
            System.out.println("Raza: " + elemento);
        });

    }

}
