package Lista; // Indicamos que esta clase está en el paquete Lista

import Operaciones; // Importamos la interfaz Operaciones de EstructuraDatos

public class ListaEnlazada extends Operaciones {
    private TipoLista tipo;
    private int tamano;
    private Nodo cabeza;
    private Nodo cola;

    public ListaEnlazada(String nombre, TipoLista tipo) {;
        this.tipo = tipo;
        this.tamano = 0;
        this.cabeza = null;
        this.cola = null;
    }

    // Getters y setters
    public TipoLista getTipo() {
        return tipo;
    }

    public void setTipo(TipoLista tipo) {
        this.tipo = tipo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getCola() {
        return cola;
    }

    public void setCola(Nodo cola) {
        this.cola = cola;
    }

    @Override
    public void agregar() {
        // Implementación del método agregar
        System.out.println("Agregando elemento a la ListaEnlazada...");
    }

    @Override
    public void eliminar() {
        // Implementación del método eliminar
        System.out.println("Eliminando elemento de la ListaEnlazada...");
    }

    @Override
    public void insertar() {
        // Implementación del método insertar
        System.out.println("Insertando elemento en la ListaEnlazada...");
    }

    // Enumeración TipoLista (dentro de la clase ListaEnlazada)
    public enum TipoLista {
        SIMPLE,
        DOBLE,
        CIRCULAR,
        DOBLEMENTE_CIRCULAR
    }

    // Clase Nodo (dentro de la clase ListaEnlazada)
    private static class Nodo {
        private Object dato;
        private Nodo siguiente;

        public Nodo(Object dato) {
            this.dato = dato;
            this.siguiente = null;
        }

        public Object getDato() {
            return dato;
        }

        public void setDato(Object dato) {
            this.dato = dato;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }
}
