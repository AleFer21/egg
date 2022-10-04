package domain;

public class Pelicula {

    private String nombre;
    private Double duracion;
    private Integer edadMin;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String nombre, Double duracion, Integer edadMin, String director) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.edadMin = edadMin;
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(Integer edadMin) {
        this.edadMin = edadMin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre: " + nombre + ", duracion: " + duracion + ", edad minima: " + edadMin + ", director: " + director + '}';
    }

}
