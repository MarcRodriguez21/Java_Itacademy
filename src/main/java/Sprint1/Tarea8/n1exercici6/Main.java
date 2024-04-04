package Sprint1.Tarea8.n1exercici6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.addAll(List.of("1", "566", "Frenvh", "Osteopatía", "3"));
        list.stream().filter(o -> o instanceof String).map(String.class::cast).sorted(Comparator.comparing(String :: length)).forEach(System.out::println);
    }
}
