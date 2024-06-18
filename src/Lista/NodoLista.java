package EstructuraDatos.Lista;

public class NodoLista {
    private int index;
    private Object valor;
    private NodoLista siguiente;
    private NodoLista anterior;
    private ListaEnlazada listaEnlazada;

    public NodoLista(int index, Object valor, ListaEnlazada listaEnlazada) {
        this.index = index;
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
        this.listaEnlazada = listaEnlazada;
    }

    // Getters y setters (omitidos por brevedad)
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLista getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLista anterior) {
        this.anterior = anterior;
    }

    public ListaEnlazada getListaEnlazada() {
        return listaEnlazada;
    }
}