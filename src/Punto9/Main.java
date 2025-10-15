package Punto9;

public class Main {
    public static void main(String[] args) {
        ListaSimpleCircular listCircular = new ListaSimpleCircular<>();

        listCircular.insertar(1020);
        listCircular.insertar("Hola");
        listCircular.insertar(2010);
        listCircular.insertar("Mundo");

        Nodo encontrado = listCircular.buscar(1020);
        if (encontrado != null){
            System.out.println("Encontrado: " + encontrado.getDato());
        } else {
            System.out.println("No encontrado.");
        }
    }
}
