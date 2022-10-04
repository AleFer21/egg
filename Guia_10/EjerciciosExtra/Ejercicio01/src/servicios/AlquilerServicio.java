package servicios;

import alquileres.Alquiler;
import barcos.*;
import java.util.*;

public class AlquilerServicio {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public void alquilarBarco() {
        Alquiler alquiler = new Alquiler();
        Velero velero = new Velero();
        BarcoAMotor barcoMotor = new BarcoAMotor();
        Yate yate = new Yate();
        System.out.println("Ingrese el nombre del cliente:");
        alquiler.setNombreCliente(scanner.next());
        System.out.println("Ingrese el dni del cliente:");
        alquiler.setDniCliente(scanner.nextInt());
        System.out.println("Ingrese la fecha actual dia/mes/año:");
        int dia1 = scanner.nextInt();
        int mes1 = scanner.nextInt();
        int anio1 = scanner.nextInt();
        Date fechaAlquiler = new Date(anio1 - 1900, mes1 - 1, dia1);
        alquiler.setFechaAlquiler(fechaAlquiler);
        System.out.println("Ingrese la fecha de devolucion dia/mes/año:");
        int dia2 = scanner.nextInt();
        int mes2 = scanner.nextInt();
        int anio2 = scanner.nextInt();
        Date fechaDevolucion = new Date(anio1 - 1900, mes1 - 1, dia1);
        alquiler.setFechaDevolucion(fechaDevolucion);
        System.out.println("Ingrese la posicion de amarre:");
        alquiler.setPosicionAmarre(scanner.next());
        int desicion = 0;
        do {
            System.out.println("Que tipo de barco desea alquilar:"
                    + "\n1. Velero."
                    + "\n2. Barco a motor."
                    + "\n3. Yate."
                    + "\n4. Finalizar.");
            desicion = scanner.nextInt();
            switch (desicion) {
                case 1:
                    System.out.println("Ingrese la cantidad de mastiles del velero:");
                    velero.setNroMastil(scanner.nextInt());
                    System.out.println("Ingrese la matricula:");
                    velero.setMatricula(scanner.next());
                    System.out.println("Ingrese la longitud de la embarcacion");
                    velero.setEslora(scanner.nextInt());
                    System.out.println("Ingrese el año de fabricacion de la embarcacion:");
                    velero.setAnioFabricacion(scanner.nextInt());
                    alquiler.setBarco(velero);
                    break;
                case 2:
                    System.out.println("Ingrese la potencia del motor:");
                    barcoMotor.setPotencia(scanner.nextInt());
                    System.out.println("Ingrese la matricula:");
                    barcoMotor.setMatricula(scanner.next());
                    System.out.println("Ingrese la longitud de la embarcacion");
                    barcoMotor.setEslora(scanner.nextInt());
                    System.out.println("Ingrese el año de fabricacion de la embarcacion:");
                    barcoMotor.setAnioFabricacion(scanner.nextInt());
                    alquiler.setBarco(barcoMotor);
                    break;
                case 3:
                    System.out.println("Ingrese la potencia del motor:");
                    yate.setPotencia(scanner.nextInt());
                    System.out.println("Ingrese la cantidad de camarotes:");
                    yate.setNroCamarotes(scanner.nextInt());
                    System.out.println("Ingrese la matricula:");
                    yate.setMatricula(scanner.next());
                    System.out.println("Ingrese la longitud de la embarcacion");
                    yate.setEslora(scanner.nextInt());
                    System.out.println("Ingrese el año de fabricacion de la embarcacion:");
                    yate.setAnioFabricacion(scanner.nextInt());
                    alquiler.setBarco(yate);
                    break;
                case 4:
                    System.out.println("Procesando alquiler...");
                    break;
            }
        } while (desicion != 4);
        System.out.println(alquiler.toString());
        System.out.println("");
        precioFinal(alquiler);
    }
    
    public void precioFinal(Alquiler a){
        int precioFinal = ((a.getFechaDevolucion().getDay() - a.getFechaAlquiler().getDay()) * a.getBarco().getEslora() * 10);
        System.out.println("El precio final es: " + precioFinal);
    }
}
