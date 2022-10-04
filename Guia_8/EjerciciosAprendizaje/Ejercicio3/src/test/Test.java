package test;

import servicio.AlumnoServicio;

public class Test {

    public static void main(String[] args) {
        
        AlumnoServicio as = new AlumnoServicio();
        as.crearAlumno();
        as.mostrarAlumnos();
        System.out.println("La nota final es: " + as.notaFinal());
        
    }
    
}