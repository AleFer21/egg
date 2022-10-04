package test;

import persona.Persona;
import servicio.PersonaServicio;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
        
        System.out.println("La edad es: " + ps.calcularEdad(p1));
        System.out.println("Es menor que la edad ingresada? " + ps.menorQue(p1, 45));
        ps.motrarPersona(p1);
        
    }
    
}
