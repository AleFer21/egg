package domain;

public class Cine {

    private Sala sala[][];
    private Double precio;
    private Pelicula pelicula;

    public Cine() {
    }

    public Cine(int filas, int columnas, Double precio, Pelicula pelicula) {
        sala = new Sala[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        llenarSala();
    }

    public Sala[][] getSala() {
        return sala;
    }

    public void setSala(Sala[][] sala) {
        this.sala = sala;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    private void llenarSala(){
        int fila = sala.length;
        for(int i = 0; i < sala.length; i++){
            for(int j = 0; j < sala[0].length; j++){
                sala[i][j] = new Sala((char) ('A' + j), fila);
            }
            fila--;
        }
    }
    
    @Override
    public String toString() {
        return "Cine{" + "sala=" + sala + ", precio=" + precio + ", pelicula=" + pelicula + '}';
    }

}
