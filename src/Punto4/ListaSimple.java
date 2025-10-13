package Punto4;

public class ListaSimple<T> {
    private Nodo<T> primero;
    private int tam;

    public ListaSimple() {
        primero = null;
        tam = 0;
    }

    public void agregarPrimero(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (primero == null) {
            primero = nuevo;
        } else {
            nuevo.setProximo(primero);
            primero = nuevo;
        }
        tam++;
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

    public ListaSimple<Integer> filtrarImpares(){
        ListaSimple<Integer> resultado = new ListaSimple<>();
        Nodo<T> actual = primero;

        while(actual != null){
            T dato = actual.getDato();
            if (dato instanceof Integer && ((Integer) dato) % 2 != 0){
                resultado.agregarUltimo((Integer) dato);
            }
            actual = actual.getProximo();
        }
        return resultado;
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
