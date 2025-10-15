package Punto8;

public class ListaDoblementeEnlazada<T extends Persona> {
    private NodoDoble<T> primero;
    private NodoDoble<T> ultimo;
    private int tam;

    public ListaDoblementeEnlazada() {
        primero = null;
        ultimo = null;
        tam = 0;
    }

    public void agregarPrimero(T dato) {
        NodoDoble<T> nuevo = new NodoDoble<>(dato);

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setProximo(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
        }
        tam++;
    }

    public void agregarUltimo(T dato) {
        NodoDoble<T> nuevo = new NodoDoble<>(dato);

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setProximo(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
        tam++;
    }

    public void mostrar() {
        if (primero == null) {
            System.out.println("[]");
            return;
        }
        NodoDoble<T> actual = primero;
        String mensaje = "[";
        while (actual != null) {
            mensaje += actual.getDato() + " ";
            actual = actual.getProximo();
        }
        mensaje += "]";
        System.out.println(mensaje);
    }

    public ListaDoblementeEnlazada<T> filtrarCedulaPar() {
        ListaDoblementeEnlazada<T> resultado = new ListaDoblementeEnlazada<>();
        NodoDoble<T> actual = primero;

        while (actual != null) {
            T elemento = actual.getDato();
            String cedula = elemento.getCedula();

            if (cedula != null && cedula.length() % 2 == 0) {
                resultado.agregarUltimo(elemento);
            }
            actual = actual.getProximo();
        }
        return resultado;
    }
}
