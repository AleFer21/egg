package test;

import cadena.Cadena;
import servicio.CadenaServicio;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        CadenaServicio cs = new CadenaServicio();
        Cadena cadena1 = new Cadena();
        
        cadena1.setFrase("Cuantas eses hay en esta frase");
        
        cs.mostrarVocales(cadena1);
        cs.invertirFrase(cadena1);
        cs.vecesRepetido(cadena1, 'a');
        cs.compararLongitud(cadena1, "Hola mundo");
        cs.unirFrases(cadena1, "menuda frase");
        cs.reemplazar(cadena1, "@");
        cs.contiene(cadena1, "z");
        
    }
    
}
