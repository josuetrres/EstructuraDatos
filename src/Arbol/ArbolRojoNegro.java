package EstructuraDatos.Arbol;

public class ArbolRojoNegro extends ArbolBinario{
    private NodoRojoNegro raiz;
    private NodoRojoNegro[] nodos;

    @Override
    public void presentarLista() {
        System.out.println("Presenting list...");
    }

    @Override
    public void recorrerInOrden() {
        System.out.println("In-order traversal...");
    }

    @Override
    public void recorrerPosOrden() {
        System.out.println("Post-order traversal...");
    }

    @Override
    public void recorrerPreOrden() {
        System.out.println("Pre-order traversal...");
    }

    @Override
    public void agregar() {
        System.out.println("Adding element...");
    }

    @Override
    public void eliminar() {
        System.out.println("Deleting element...");
    }

    @Override
    public void insertar() {
        System.out.println("Inserting element...");
    }
}
