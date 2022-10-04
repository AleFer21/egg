package test;

import nif.Nif;
import servicio.NifServicio;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        NifServicio ns = new NifServicio();
        Nif n1 = ns.crearNif();
        
        ns.mostrar(n1);
        
    }
    
}
