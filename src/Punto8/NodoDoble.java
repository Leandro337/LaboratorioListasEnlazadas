package Punto8;

import Punto4.Nodo;

public class NodoDoble<T> {
    private T dato;
    private NodoDoble<T> proximo;
    private NodoDoble<T> anterior;

    public NodoDoble(T dato) {
        this.dato = dato;
        this.proximo = null;
        this.anterior = null;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoDoble<T> getProximo() {
        return proximo;
    }

    public void setProximo(NodoDoble<T> proximo) {
        this.proximo = proximo;
    }
}
