package Punto3;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple<Integer> list = new ListaEnlazadaSimple<>();

        list.agregarPrimero(6);
        list.agregarPrimero(5);
        list.agregarPrimero(4);
        list.agregarPrimero(3);
        list.agregarPrimero(2);
        list.agregarPrimero(1);

        list.mostrar();
        list.eliminarPares();
        list.mostrar();
    }
}
