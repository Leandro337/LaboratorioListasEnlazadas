package Punto6;

import Punto4.Nodo;

public class ListaDoblementeEnlazada<T> {
    private NodoDoble<T> primero;
    private NodoDoble<T> ultimo;
    private int tam;

    public ListaDoblementeEnlazada() {
        primero = null;
        ultimo = null;
        tam = 0;
    }

    public void agregarUltimo (T dato){
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

    public void imprimirHaciaAtras() {
        if (ultimo == null){
            System.out.println("[]");
            return;
        }
        NodoDoble<T> actual = ultimo;
        String mensaje = "[";
        while (actual != null){
            mensaje += actual.getDato() + " ";
            actual = actual.getAnterior();
        }
        mensaje += "]";
        System.out.println(mensaje);
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
}
