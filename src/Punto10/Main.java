package Punto10;

public class Main {
    public static void main(String[] args) {
        ListaSimple<String> list1 = new ListaSimple<>();
        list1.agregarUltimo("A");
        list1.agregarUltimo("B");
        list1.mostrar();

        ListaSimple<String> list2 = new ListaSimple<>();
        list2.agregarUltimo("C");
        list2.agregarUltimo("D");
        list2.mostrar();

        ListaSimple<String> resultado = ListaSimple.concatenar(list1, list2);
        resultado.mostrar();

    }
}
