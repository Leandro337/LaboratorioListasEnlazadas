package Punto2;

public class Main {
    public static void main(String[] args) {
        ListaSimplePersonas<Persona> lista = new ListaSimplePersonas<>();

        lista.agregarPrimero(new Persona("1020305", "Leo"));
        lista.agregarPrimero(new Persona("102030", "Leandro"));
        lista.agregarPrimero(new Persona("10203", "Leo"));
        lista.agregarPrimero(new Persona("10203050", "Le"));
        lista.agregarPrimero(new Persona("10203040", "Sara"));

        System.out.println(lista.mostrarCedulaPar());
    }
}
