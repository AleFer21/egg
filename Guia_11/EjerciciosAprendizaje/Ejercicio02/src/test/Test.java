package test;

public class Test {
    
    public static void main(String[] args) {
        
        int array[] = new int [4]; 
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        
        try{
            array[4] = 5; 
        } catch(ArrayIndexOutOfBoundsException a){
            System.out.println("ERROR: Indice del array fuera de tamaño.");
        }
        
    }
    
}
