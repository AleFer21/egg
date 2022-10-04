package edificio;

public class Polideportivo extends Edificio {

    private String nombre;
    private String instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String instalacion) {
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public Polideportivo(String nombre, String instalacion, Integer alto, Integer ancho, Integer largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }

    @Override
    public void calcularSuperficie() {
        int superficie = this.ancho * this.largo;
        System.out.println("La superficie del polideportivo es: " + superficie + " mts^2.");
    }

    @Override
    public void calcularVolumen() {
        int volumen = this.alto * this.ancho * this.largo;
        System.out.println("El volumen del polideportivo es: " + volumen + " mts^3.");
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre: " + nombre + ", instalacion: " + instalacion + super.toString() + '}';
    }

}
