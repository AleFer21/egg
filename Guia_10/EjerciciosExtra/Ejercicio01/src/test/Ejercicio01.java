package test;

import alquileres.Alquiler;
import barcos.*;
import java.util.Date;
import servicios.AlquilerServicio;

public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        AlquilerServicio as = new AlquilerServicio();
//        as.alquilarBarco();
        Barco velero = new Velero(1, "AA345C", 10, 2007);
        Date fechaAlquiler = new Date(2022 - 1900, 8 - 1, 15);
        Date fechaDevolucion = new Date(2022 - 1900, 8 - 1, 22);
        Alquiler alquiler = new Alquiler("Alejandro Fernandez", 37534831, fechaAlquiler, fechaDevolucion, "Costado", velero);
        System.out.println(alquiler.toString());
        as.precioFinal(alquiler);
        
        
    }
    
}
