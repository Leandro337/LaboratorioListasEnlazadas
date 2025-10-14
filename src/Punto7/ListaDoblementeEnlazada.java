package Punto7;

import java.util.Iterator;

public class ListaDoblementeEnlazada<T> implements Iterable<T> {
    private NodoDoble<T> primero;
    private NodoDoble<T> ultimo;
    private int tam;

    public ListaDoblementeEnlazada() {
        primero = null;
        ultimo = null;
        tam = 0;
    }

    public void agregarUltimo(T dato){
        NodoDoble<T> nuevo = new NodoDoble<>(dato);

        if (primero == null){
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setProximo(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
        tam++;
    }

    public void agregarPrimero(T dato){
        NodoDoble<T> nuevo = new NodoDoble<>(dato);

        if (primero == null){
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setProximo(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
        }
        tam++;
    }

    public void mostrar() {
        if (primero == null){
            System.out.println("[]");
            return;
        }
        NodoDoble<T> actual = primero;
        String mensaje = "[";
        while (actual != null){
            mensaje += actual.getDato() + " ";
            actual = actual.getProximo();
        }
        mensaje += "]";
        System.out.println(mensaje);

    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorLista();
    }

    private class IteradorLista implements Iterator<T> {
        private NodoDoble<T> actual = primero;
        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public T next() {
            T dato = actual.getDato();
            actual = actual.getProximo();
            return dato;
        }
    }
}
