package Punto1;

public class ListaSimple <T> {
    private Nodo<T> primero;
    private int tam;

    public ListaSimple(){
        primero = null;
        tam = 0;
    }

    public void agregarPrimero (T dato){
        Nodo<T> nuevo = new Nodo<>(dato);

        if (primero == null){
            primero = nuevo;
        } else {
            nuevo.setProximo(primero);
            primero = nuevo;
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

    public void mostrarPares (){
        Nodo<T> actual = primero;
        int posicion = 0;
        String mensaje = "[";

        while (actual != null){
            if (posicion % 2 != 0){
                mensaje += actual.getDato() + " ";
            }
            actual = actual.getProximo();
            posicion++;
        }
        mensaje += "]";
        System.out.println(mensaje);
    }
}
