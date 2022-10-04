package servicio;

import alumno.Alumno;
import java.util.*;

public class AlumnoServicio {

    private Scanner scanner;
    private List<Alumno> alumnos;

    public AlumnoServicio() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList<>();
    }

    public Alumno crearAlumno() {
        Alumno alumno = new Alumno();
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del alumno:");
            String nombre = scanner.next();
            System.out.println("Ingrese la primer nota:");
            int nota1 = scanner.nextInt();
            System.out.println("Ingrese la segunda nota:");
            int nota2 = scanner.nextInt();
            System.out.println("Ingrese la tercer nota:");
            int nota3 = scanner.nextInt();
            System.out.println("Desea cargar otro alumno? Si/No");
            respuesta = scanner.next();
            alumno = new Alumno(nombre, nota1, nota2, nota3);
            alumnos.add(alumno);
        } while (respuesta.equalsIgnoreCase("si"));
        return alumno;
    }
    
    public double notaFinal(){
        double promedio = 0;
        System.out.println("Ingrese el nombre del alumno para calcular su nota final");
        String calcularAlumno = scanner.next();
        for(Alumno alumno : alumnos){
            if(alumno.getNombre().equalsIgnoreCase(calcularAlumno)){
                promedio = (alumno.getNota1() + alumno.getNota2() + alumno.getNota3()) / 3;
            }
        }
        return promedio;
    }

    public void mostrarAlumnos() {
        alumnos.forEach(alumno -> {
            System.out.println(alumno.toString());
        });
    }
    
}
