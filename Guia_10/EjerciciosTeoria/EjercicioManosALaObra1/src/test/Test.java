package test;

import entidades.*;
import java.util.*;

public class Test {
    
    public static void main(String[] args) {
        
        Animal a = new Animal();
        Animal p = new Perro();
        Animal g = new Gato();
        
        List<Animal> animales = new ArrayList();
        
        animales.add(a);
        animales.add(p);
        animales.add(g);
        
        for(Animal animal : animales){
            if(animal instanceof Perro){
                Perro object = (Perro) animal;
                p.hacerRuido();
                continue;
            }
            if(animal instanceof Gato){
                Gato object = (Gato) animal;
                g.hacerRuido();
                continue;
            }
            if(animal instanceof Animal){
                Animal object = (Animal) animal;
                a.hacerRuido();
                continue;
            }
        }
        
    }
    
}
