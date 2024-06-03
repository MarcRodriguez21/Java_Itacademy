package Sprint3.Tarea1.Nivel1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Undo {

    private Scanner scan = new Scanner(System.in);
    private List<String> undoList = new ArrayList<>();
    private static final String ADD = "add";
    private static final String REMOVE = "remove";
    private static final String LIST = "list";

    private static Undo instance;

    private Undo() {
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void add(String command) {
        undoList.add("option 1 : add order");
        undoList.add(ADD + " " + command);
        System.out.println("Command added");
    }

    public void remove() {
        System.out.println("Select an action to remove:");
        for(int i = 0; i < undoList.size(); i++) {
            System.out.println((i + 1) + ". " + undoList.get(i));
        }
        int index = scan.nextInt();
        if (index >= 1 && index <= undoList.size()) {
            undoList.add("option 2 : remove order");
            undoList.add(REMOVE + " " + undoList.get(index - 1));
            undoList.remove(index - 1);
            System.out.println("Action removed");
        } else {
            undoList.add("Invalid index");
            System.out.println("Invalid index");
        }
    }

    public void list() {
        undoList.add("option 3 : list orders");
        for(String undo : undoList) {
            System.out.println(undo);
        }
        undoList.add(LIST + " orders listed");
    }
}
