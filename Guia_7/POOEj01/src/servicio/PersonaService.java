package servicio;

import entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    
    Scanner scanner = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        Persona personaCompleta = new Persona();
        System.out.println("Ingrese el nombre:");
        personaCompleta.setNombre(scanner.next());
        System.out.println("Ingrese el apellido:");
        personaCompleta.setApellido(scanner.next());
        System.out.println("Ingrese la edad:");
        personaCompleta.setEdad(scanner.nextInt());
        
        return personaCompleta;
        
    }
    
}
