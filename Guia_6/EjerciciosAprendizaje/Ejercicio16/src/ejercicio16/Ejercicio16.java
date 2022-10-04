package ejercicio16;

import java.util.*;

public class Ejercicio16 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor de n");
        int n = leer.nextInt();
        int arreglo[] = new int [n];
        boolean bandera = false;
        Random r = new Random();
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = r.nextInt(99) + 1;
        }
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("El arreglo se encentra en la posicion " + i + " = [" + arreglo[i] + "]");
        }
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == arreglo[i]){
                bandera = true;   
            }
        }
        if(bandera == true){
            System.out.println("Hay valores repetidos");
        } else {
            System.out.println("No se repitieron valores");
        }
    }
    
}
