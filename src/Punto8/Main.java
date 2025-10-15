package Punto8;

public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada<Persona> personas = new ListaDoblementeEnlazada<>();
        personas.agregarUltimo(new Persona("10203040", "Manolo"));
        personas.agregarUltimo(new Persona("1020304", "Pepito"));
        personas.agregarPrimero(new Persona("102030", "Juanito"));
        personas.agregarUltimo(new Persona("10203040", "Juanita"));
        personas.agregarPrimero(new Persona("10203040", "Manola"));
        personas.mostrar();

        ListaDoblementeEnlazada<Persona> cedulasPares = personas.filtrarCedulaPar();
        cedulasPares.mostrar();

    }
}
