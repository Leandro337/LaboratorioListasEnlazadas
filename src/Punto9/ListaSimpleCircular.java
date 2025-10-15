package Punto9;

public class ListaSimpleCircular<T> {
    private Nodo<T> primero;
    private int tam;

    public ListaSimpleCircular() {
        primero = null;
        tam = 0;
    }

    public void insertar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (primero == null) {
            primero = nuevo;
            nuevo.setProximo(primero);
        } else {
            Nodo<T> actual = primero;
            while (actual.getProximo() != primero) {
                actual = actual.getProximo();
            }
            actual.setProximo(nuevo);
            nuevo.setProximo(primero);
        }
        tam++;
    }

    public Nodo<T> buscar(T dato) {
        if (primero == null) return null;

        Nodo<T> actual = primero;
        do {
            if (actual.getDato().equals(dato)) {
                return actual;
            }
            actual = actual.getProximo();
        } while (actual != primero);
        return null;
    }
}
