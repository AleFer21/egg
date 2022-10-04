package pooej01;

import entidad.Persona;
import servicio.PersonaService;

public class POOEj01 {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Alejandro", "Fernandez", 28);
        System.out.println(persona1.toString());
        
        PersonaService personaService = new PersonaService();
        
        Persona persona2 = personaService.crearPersona();
        System.out.println(persona2.toString());
        
    }
    
}
