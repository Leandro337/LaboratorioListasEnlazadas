package Punto5;

public class Main {
    public static void main(String[] args) {
        ListaSimple<Integer> list = new ListaSimple<>();

        list.agregarPrimero(1);
        list.agregarPrimero(2);
        list.agregarPrimero(3);
        list.agregarUltimo(3);
        list.agregarUltimo(3);
        list.agregarUltimo(4);
        list.agregarUltimo(3);
        list.mostrar();

        int repeticiones = list.contarRepeticiones(3);
        System.out.println("El número 3 se repite " + repeticiones + " veces.");
    }
}
