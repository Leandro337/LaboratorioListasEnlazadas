package Punto1;

public class Main {

    public static void main(String[] args) {
        ListaSimple nuevaLista = new ListaSimple<>();

        nuevaLista.agregarPrimero(1);
        nuevaLista.agregarPrimero(2);
        nuevaLista.agregarPrimero(3);
        nuevaLista.agregarPrimero(4);
        nuevaLista.agregarPrimero(5);
        nuevaLista.agregarPrimero(6);

        nuevaLista.mostrar();
        nuevaLista.mostrarPares();
    }
}
