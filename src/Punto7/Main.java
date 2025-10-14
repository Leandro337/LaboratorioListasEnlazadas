package Punto7;

public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada<String> list = new ListaDoblementeEnlazada<>();
        list.agregarPrimero("Hola");
        list.agregarPrimero("Mundo");
        list.agregarUltimo("Hola");
        list.agregarUltimo("Mundo");
        list.mostrar();

        for (String valor : list){
            System.out.println(valor);
        }
    }
}
