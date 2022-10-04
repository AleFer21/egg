package servicio;

import cafetera.Cafetera;

public class CafeteraServicio {

    public Cafetera llenarCafetera() {
        Cafetera cafetera = new Cafetera();
        cafetera.setCapacidadMaxima(1500);
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera esta a su maxima capacidad (" + cafetera.getCapacidadMaxima() + " ml).");
        return cafetera;
    }

    public int servirTaza(Cafetera cafetera, int cantidad) {
        if (cantidad <= cafetera.getCantidadActual()) {
            switch (cantidad) {
                case 270:
                    System.out.println("Sirviendo taza grande.");
                    cafetera.setCantidadActual(cafetera.getCantidadActual() - cantidad);
                    break;
                case 150:
                    System.out.println("Sirviendo taza mediana.");
                    cafetera.setCantidadActual(cafetera.getCantidadActual() - cantidad);
                    break;
                case 80:
                    System.out.println("Sirviendo taza chica.");
                    cafetera.setCantidadActual(cafetera.getCantidadActual() - cantidad);
                    break;
            }
        } else if (cantidad > cafetera.getCantidadActual() && cafetera.getCantidadActual() > 0) {
            System.out.println("La taza no se lleno.");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - cantidad);
        } else if (cafetera.getCantidadActual() < 0) {
            System.out.println("La cafetera esta vacia.");
        }
        return cafetera.getCantidadActual();
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCapacidadMaxima(0);
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera esta vacia.");
    }

    public void agregarCafe(Cafetera cafetera, int agregar) {
        cafetera.setCantidadActual(agregar + cafetera.getCantidadActual());
        System.out.println("Se agrego " + agregar + " ml de cafe.");
    }

}
