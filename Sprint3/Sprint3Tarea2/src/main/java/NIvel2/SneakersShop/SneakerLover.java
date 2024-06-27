package NIvel2.SneakersShop;

import NIvel2.PaymentMethod.BankAccount;
import NIvel2.PaymentMethod.Card;
import NIvel2.PaymentMethod.PaymentGateway;
import NIvel2.PaymentMethod.Paypal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SneakerLover {
    static Scanner scan = new Scanner(System.in);

    static BankAccount account = new BankAccount(123456789);
    static Card card = new Card(123456789);
    static Paypal paypal = new Paypal("a@a.com");
    private static Sneakers nike1 = new Sneakers("Nike", "AirMax", 120,10);
    private static Sneakers adidas1 = new Sneakers("adidas", "Yeezy", 100,15);
    private static Sneakers jordan1 = new Sneakers("Jordan", "Air", 150,20);
    private static Sneakers nike2 = new Sneakers("Nike", "AirForce", 120,30);
    private static Sneakers jordan2 = new Sneakers("Jordan", "IV", 190,40);

    public static List<Sneakers> sneakerList = new ArrayList<>(Arrays.asList(nike1, adidas1, jordan1, nike2, jordan2));

    public static void menu() {

        int option = 0;
        while (option != 3) {
            System.out.println();
            System.out.println("Bienvenido!");
            System.out.println();
            System.out.println("1. Ver Sneakers");
            System.out.println("2. Comprar Sneakers");
            System.out.println("3. Salir");
            System.out.println();
            System.out.println("Que deseas hacer?");
            System.out.print("> ");

            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    showSneakers();
                    break;
                case 2:
                    buySneakers();
                    break;
                case 3:
                    System.out.println("Hasta la proxima!");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        }

    }

    public static void buySneakers() {
        showSneakers();
        System.out.println();
        System.out.println("Cual deseas comprar?");
        int sneakerNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Desea comprar el sneaker " + sneakerList.get(sneakerNumber - 1).toString() + "?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int answer = scan.nextInt();
        scan.nextLine();
        if (answer == 1) {
            System.out.println("Como deseas pagar?");
            System.out.println("1. Tarjeta");
            System.out.println("2. Paypal");
            System.out.println("3. Cuenta");
            int paymentMethod = scan.nextInt();
            scan.nextLine();
            PaymentGateway paymentGateway = new PaymentGateway();
            if (paymentMethod == 1) {
                paymentGateway.pay(card, sneakerList.get(sneakerNumber - 1).getPrice());
            } else if (paymentMethod == 2) {
                paymentGateway.pay(paypal, sneakerList.get(sneakerNumber - 1).getPrice());
            } else if (paymentMethod == 3) {
                paymentGateway.pay(account, sneakerList.get(sneakerNumber - 1).getPrice());
            }
            sneakerList.get(sneakerNumber - 1).setStock(sneakerList.get(sneakerNumber - 1).getStock() - 1);
            System.out.println("Sneaker comprado");
            System.out.println("Stock: " + sneakerList.get(sneakerNumber - 1).getStock());
        } else {
            System.out.println("Sneaker no comprado");
        }
    }

    public static void showSneakers() {
        for (int i = 0; i < sneakerList.size(); i++) {
            System.out.println((i + 1) + ". " + sneakerList.get(i).toString());
        }

    }
}
