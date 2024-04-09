package Sprint1.Tarea8.n1exercici2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(List.of("mapa", "mapo", "capa", "capo", "tapa", "tapo", "sopa", "sopo", "ropa", "rope", "maripo"));

        list.stream().filter(o -> o.contains("o") && o.length() < 5).toList().forEach(System.out::println);

    }
}
