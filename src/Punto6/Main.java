package Punto6;

public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lisDoble = new ListaDoblementeEnlazada<>();

        lisDoble.agregarUltimo(10);
        lisDoble.agregarUltimo(20);
        lisDoble.agregarUltimo(30);
        lisDoble.agregarUltimo(40);
        lisDoble.agregarUltimo(50);

        lisDoble.mostrar();
        lisDoble.imprimirHaciaAtras();
    }
}
