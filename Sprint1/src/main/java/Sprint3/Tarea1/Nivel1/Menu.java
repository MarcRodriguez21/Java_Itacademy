package Sprint3.Tarea1.Nivel1;

import java.util.Scanner;

public class Menu {
    public static void printMenu() {
        Scanner scan = new Scanner(System.in);
        Undo undo = Undo.getInstance();
        System.out.println("Menu");
        //limpiar
        System.out.println("1. Add command");
        System.out.println("2. Remove command");
        System.out.println("3. Undo list");
        System.out.println("4. Exit");
        switch (scan.nextInt()) {//dowhile
            case 1:
                scan.nextLine();
                System.out.println("Add command");
                String command = scan.nextLine();
                undo.add(command);
                break;
            case 2:
                System.out.println("Remove command");
                undo.remove();
                break;
            case 3:
                System.out.println("Undo");
                undo.list();
                break;
            case 4:
                System.out.println("Exit");
                break;
        }

    }
}
