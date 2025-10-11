package Punto2;

import java.util.ArrayList;
import java.util.List;

public class ListaSimplePersonas <T extends Persona> {
    private Nodo<T> primero;
    private int tam;

    public ListaSimplePersonas(){
        primero = null;
        tam = 0;
    }

    public void agregarPrimero (T dato){
        Nodo<T> nuevo = new Nodo<>(dato);

        if (primero == null){
            primero = nuevo;
        } else {
            nuevo.setProximo(primero);
            primero = nuevo;
        }
        tam++;
    }

    public void mostrar() {
        Punto2.Nodo<T> actual = primero;
        String mensaje = "[";
        while (actual != null) {
            mensaje += actual.getDato() + " ";
            actual = actual.getProximo();
        }
        mensaje += "]";
        System.out.println(mensaje);
    }

    public List<T> mostrarCedulaPar (){
        List<T> resultado = new ArrayList<>();
        Nodo<T> actual = primero;

        while (actual != null){
            T persona = actual.getDato();
            String cedula = persona.getCedula();

            if (cedula != null && cedula.length() %2 == 0){
                resultado.add(persona);
            }
            actual = actual.getProximo();
        }
        return resultado;
    }
}
