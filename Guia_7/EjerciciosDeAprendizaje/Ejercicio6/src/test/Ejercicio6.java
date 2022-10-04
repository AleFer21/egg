package test;

import cafetera.Cafetera;
import servicio.CafeteraServicio;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        CafeteraServicio cafeS = new CafeteraServicio();
        Cafetera cafe = cafeS.llenarCafetera();

        System.out.println(cafeS.servirTaza(cafe, 270));
        System.out.println(cafeS.servirTaza(cafe, 270));
        System.out.println(cafeS.servirTaza(cafe, 270));
        System.out.println(cafeS.servirTaza(cafe, 270));
        cafeS.agregarCafe(cafe, 500);
        System.out.println(cafeS.servirTaza(cafe, 150));
        System.out.println("La cafetera tiene " + cafe.getCantidadActual() + " ml de cafe.");
        cafeS.vaciarCafetera(cafe);
        System.out.println("La cafetera tiene " + cafe.getCantidadActual() + " ml de cafe.");

        
    }

}
