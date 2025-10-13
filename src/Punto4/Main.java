package Punto4;

public class Main {
    public static void main(String[] args) {
        ListaSimple<Integer> list = new ListaSimple<>();
        list.agregarPrimero(2);
        list.agregarPrimero(3);
        list.agregarPrimero(4);
        list.agregarUltimo(1);
        list.mostrar();

        ListaSimple<Integer> impares = list.filtrarImpares();
        impares.mostrar();

    }
}
