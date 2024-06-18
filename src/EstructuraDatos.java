<<<<<<< HEAD:EstructuraDatos.java
=======
package EstructuraDatos;
>>>>>>> 9478e2b5cdf376a85c3842f4a7c7b65a16ac0dad:src/EstructuraDatos.java

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
