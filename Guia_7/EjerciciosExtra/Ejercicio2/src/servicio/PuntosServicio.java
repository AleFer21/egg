package servicio;

import java.util.Scanner;
import puntos.Puntos;

public class PuntosServicio {
    
    Scanner scanner = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        Puntos punto = new Puntos();
        System.out.println("Ingrese la coordenada x1:");
        punto.setX1(scanner.nextDouble());
        System.out.println("Ingrese la coordenada y1:");
        punto.setY1(scanner.nextDouble());
        System.out.println("Ingrese la coordenada x2:");
        punto.setX2(scanner.nextDouble());
        System.out.println("Ingrese la coordenada y2:");
        punto.setY2(scanner.nextDouble());
        return punto;
    }
    
    public void distanciaEntrePuntos(Puntos puntos){
        double distancia = Math.sqrt(((puntos.getX2() - puntos.getX1()) * (puntos.getX2() - puntos.getX1())) + ((puntos.getY2() - puntos.getY1()) * (puntos.getY2() - puntos.getY1())));
        System.out.println("La distancia entre puntos es: " + distancia);
    }
    
}
