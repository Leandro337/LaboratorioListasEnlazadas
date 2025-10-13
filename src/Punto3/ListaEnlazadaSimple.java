package Punto3;

public class ListaEnlazadaSimple<T> {
    private Nodo<T> primero;
    private int tam;

    public ListaEnlazadaSimple() {
        primero = null;
        tam = 0;
    }

    public void agregarPrimero(T dato) {
        Nodo<T> nodo = new Nodo<>(dato);

        if (primero == null) {
            primero = nodo;
        } else {
            nodo.setProximo(primero);
            primero = nodo;
        }
        tam++;
    }

    public boolean esPar(T dato) {
        if (dato instanceof Integer) {
            return ((Integer) dato) % 2 == 0;
        }
        return false;
    }

    public void eliminarPares() {
        while (primero != null && esPar(primero.getDato())) {
            primero = primero.getProximo();
            tam--;
        }

        Nodo<T> actual = primero;
        while (actual != null && actual.getProximo() != null) {
            if (esPar(actual.getProximo().getDato())) {
                actual.setProximo(actual.getProximo().getProximo());
                tam--;
            } else {
                actual = actual.getProximo();
            }
        }
    }

    public void mostrar() {
        Nodo<T> actual = primero;
        String mensaje = "[";
        while (actual != null) {
            mensaje += actual.getDato() + " ";
            actual = actual.getProximo();
        }
        mensaje += "]";
        System.out.println(mensaje);
    }
}
