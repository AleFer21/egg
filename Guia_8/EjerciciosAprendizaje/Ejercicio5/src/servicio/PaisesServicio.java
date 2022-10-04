package servicio;

import java.util.*;
import paises.Paises;

public class PaisesServicio {
    
    private Scanner scanner;
    private Set<String> paises;

    public PaisesServicio() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
        this.paises = new TreeSet<>();
    }
    
    public Paises crearPaises(){
        Paises pais = new Paises();
        String respuesta;
        do{
            System.out.println("Ingrese el nombre del pais:");
            String nombre = scanner.next();
            pais = new Paises(nombre);
            paises.add(nombre);
            System.out.println("Desea ingresar otro pais? Si/No");
            respuesta = scanner.next();
        } while(respuesta.equalsIgnoreCase("si"));
        return pais;
    }
    
    public void mostrarPaises(){
        System.out.println("Los paises son:");
        paises.forEach(pais -> {
            System.out.println(pais.toString());
        });
    }
    
    public void eliminarPais(){
        System.out.println("Ingrese el pais a eliminar:");
        String eliminar = scanner.next();
        Iterator<String> it = paises.iterator();
        while(it.hasNext()){
            if(it.next().equalsIgnoreCase(eliminar)){
                it.remove();
            }
        }
    }
    
}
