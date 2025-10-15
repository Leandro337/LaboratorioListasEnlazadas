package Punto10;

public class ListaSimple<T> {
    private Nodo<T> primero;
    private int tam;

    public ListaSimple() {
        primero = null;
        tam = 0;
    }

    public void agregarUltimo(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo<T> actual = primero;
            while (actual.getProximo() != null) {
                actual = actual.getProximo();
            }
            actual.setProximo(nuevo);
        }
        tam++;
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

    public Nodo<T> getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo<T> primero) {
        this.primero = primero;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public static <T> ListaSimple<T> concatenar(ListaSimple<T> l1, ListaSimple<T> l2) {
        ListaSimple<T> resultado = new ListaSimple<>();

        Nodo<T> actual = l1.getPrimero();
        while (actual != null) {
            resultado.agregarUltimo(actual.getDato());
            actual = actual.getProximo();
        }

        actual = l2.getPrimero();
        while (actual != null) {
            resultado.agregarUltimo(actual.getDato());
            actual = actual.getProximo();
        }
        return resultado;
    }
}
