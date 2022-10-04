package ejercicio2;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        List<String> perros = new ArrayList<>();

        String decision;

        do {
            System.out.println("Ingrese una raza de perro:");
            String raza = scanner.next().toLowerCase();
            perros.add(raza);
            System.out.println("Desea continuar? Si/No");
            decision = scanner.next().toLowerCase();
        } while (!decision.equals("no"));

        System.out.println("Ingrese la raza a buscar:");

        String razaBuscar = scanner.next().toLowerCase();

        if (!perros.contains(razaBuscar)) {
            System.out.println("La raza no se encuentra en la lista.");
        }
        
        Iterator<String> it = perros.iterator();
        while (it.hasNext()) {
            if (it.next().equals(razaBuscar)) {
                it.remove();
            }
        }

        Collections.sort(perros);

        perros.forEach(elemento -> {
            System.out.println("Raza: " + elemento);
        });
    }
}
