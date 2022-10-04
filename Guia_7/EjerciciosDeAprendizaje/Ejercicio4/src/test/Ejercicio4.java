package test;

import rectangulo.Rectangulo;
import servicio.RectanguloServicio;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        RectanguloServicio rs1 = new RectanguloServicio();
        Rectangulo r1 = rs1.crearRectangulo();
        
        rs1.superficie(r1);
        rs1.perimetro(r1);
        rs1.dibujarRectangulo(r1);
        
    }
    
}
