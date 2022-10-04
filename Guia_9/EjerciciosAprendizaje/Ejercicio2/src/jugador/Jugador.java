package jugador;

import revolver.Revolver;

public class Jugador {

    private Integer id;
    private String nombre;
    private Boolean mojado;

    public Jugador(Integer id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    public void disparo(Revolver r) {
        System.out.println("El " + nombre + " se apunta...");
        if (r.mojar()) {
            this.mojado = true;
            System.out.println("El " + nombre + " se mojo, ha perdido el juego.");
        } else {
            System.out.println("El " + nombre + " no se mojo, continua el juego..");
        }
    }
    
    public boolean noEstaMojado(){
        return mojado;
    }

}
