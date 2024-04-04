package Sprint1.Tarea8.n1exercici4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(List.of("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"));

        list.forEach(System.out::println);
    }
}
