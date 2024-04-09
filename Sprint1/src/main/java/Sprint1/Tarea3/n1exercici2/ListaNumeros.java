package Sprint1.Tarea3.n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListaNumeros {
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        System.out.println("Primera lista de Integers.");
        System.out.println();

        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(45);
        listaNumeros.add(44);
        listaNumeros.add(74);
        listaNumeros.add(14);
        listaNumeros.add(21);
        listaNumeros.add(89);

        System.out.println("Lista Original");
        System.out.println(listaNumeros);

        System.out.println();
        System.out.println("Segunda lista de Integers");
        System.out.println();


        List<Integer> listaNumerosAlRevesIterados = new ArrayList<>();
        List<Integer> listaNumerosAlReves = new ArrayList<>();
        ListIterator<Integer> iterador = listaNumeros.listIterator(listaNumeros.size());

        // Método con iterador

        System.out.println("Lista Iterada");
        while(iterador.hasPrevious()) {
            int numeroListaIterado = iterador.previous();
            listaNumerosAlRevesIterados.add(numeroListaIterado);
        }
        System.out.println(listaNumerosAlRevesIterados);

        System.out.println();
        System.out.println("Tercera lista de Integers.");
        System.out.println();
        System.out.println("Lista con for.");
        System.out.println();

        // Método clásico
        for(int i = (listaNumeros.size()-1); i >= 0; i--) {
            int numeroLista = listaNumeros.get(i);
            listaNumerosAlReves.add(numeroLista);
        }

        System.out.println(listaNumerosAlReves);

    }

}

