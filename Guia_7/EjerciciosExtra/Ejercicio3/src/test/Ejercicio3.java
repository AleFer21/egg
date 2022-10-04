package test;

import raices.Raices;
import servicio.RaicesServicio;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        RaicesServicio rs = new RaicesServicio();
        Raices r1 = rs.coeficientes();
        
        rs.getDiscriminante(r1);
        System.out.println(rs.tieneRaices(r1));
        rs.obtenerRaices(r1);
       
    }
    
}
