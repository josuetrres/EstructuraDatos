
public abstract class EstructuraDatos implements Operaciones {
    private String nombre;

    // Constructor
    public EstructuraDatos(String nombre) {
        this.nombre = nombre;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
