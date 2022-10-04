package services;

import entidades.*;
import java.util.*;

public class PPService {

    private Scanner scanner;
    private ArrayList<Persona> personas;
    private ArrayList<Perro> perros;

    public PPService() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
        this.personas = new ArrayList<>();
        this.perros = new ArrayList<>();
    }

    public Persona crearPersona() {
        Persona persona = new Persona();
        Perro perro = new Perro();
        String decision = "";
        do {
            System.out.println("Ingrese el nombre de la persona:");
            String nombre = scanner.next();
            System.out.println("Ingrese el apellido de la persona:");
            String apellido = scanner.next();
            System.out.println("Ingrese la edad de la persona:");
            int edad = scanner.nextInt();
            System.out.println("Ingrese el documento de la persona:");
            int documento = scanner.nextInt();
            persona = new Persona(nombre, apellido, edad, documento, perro);
            personas.add(persona);
            System.out.println("Desea cargar otra persona? Si/No");
            decision = scanner.next();
        } while (!decision.equalsIgnoreCase("no"));
        return persona;
    }

    public Perro crearPerro() {
        Perro perro = new Perro();
        String decision = "";
        do {
            System.out.println("Ingrese el nombre del perro:");
            String nombre = scanner.next();
            System.out.println("Ingrese la raza del perro:");
            String raza = scanner.next();
            System.out.println("Ingrese la edad del perro:");
            int edad = scanner.nextInt();
            System.out.println("Ingrese el tamaño del perro:");
            String tamanio = scanner.next();
            perro = new Perro(nombre, raza, edad, tamanio);
            perros.add(perro);
            System.out.println("Desea cargar otro perro? Si/No");
            decision = scanner.next();
        } while (!decision.equalsIgnoreCase("no"));
        return perro;
    }

    public void adoptarPerro() {
        for (Persona persona : personas) {
            System.out.println("Para " + persona.getNombre() + " " + persona.getApellido() + " quiere adoptar a:");
            for (Perro perro : perros) {
                System.out.println("Nombre: " + perro.getNombre() + ", Raza: " + perro.getRaza());
            }
            String adoptable = scanner.next();
            int control = 0;
            for (int i = 0; i < perros.size(); i++) {
                if (adoptable.equalsIgnoreCase(perros.get(i).getNombre())) {
                    persona.setPerro(perros.get(i));
                    control++;
                    perros.remove(i);
                }
            }
            if (control == 0) {
                System.out.println("No se ha adoptado un perro valido.");
            }
        }
        System.out.println("Las siguientes personas han adoptado:");
        for (Persona persona : personas) {
            if (persona.getPerro() == null) {
                System.out.println(persona.getNombre() + " " + persona.getApellido() + " no ha adoptado ningun perro.");
            } else {
                System.out.println(persona.getNombre() + " " + persona.getApellido() + " ha adoptado a " + persona.getPerro().getNombre());
            }
        }
    }

    public void mostrarPersonas() {
        personas.forEach(elemento -> {
            System.out.println(elemento);
        });
    }

    public void mostrarPerros() {
        perros.forEach(elemento -> {
            System.out.println(elemento);
        });
    }

}
