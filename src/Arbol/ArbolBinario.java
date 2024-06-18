package EstructuraDatos.Arbol;

import EstructuraDatos.EstructuraDatos;

public abstract class ArbolBinario extends EstructuraDatos{
    protected NodoArbol raiz;

    private int nroNodos;

    public abstract void presentarLista();

    public abstract void recorrerInOrden();

    public abstract void recorrerPosOrden();

    public abstract void recorrerPreOrden();
}