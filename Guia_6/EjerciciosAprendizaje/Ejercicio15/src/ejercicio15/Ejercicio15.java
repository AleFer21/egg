package ejercicio15;

public class Ejercicio15 {

    public static void main(String[] args) {
        
        int arreglo[] = new int [100];
        int contador = 100;
        
        for(int i = 0; i < arreglo.length; i++){
            arreglo [i] = contador--;
            System.out.println("arreglo = [" + arreglo[i] + "]");
        }
        
    }
    
}
