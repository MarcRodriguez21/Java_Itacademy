package Sprint3.Tarea1.Nivel2.Menu;

import Sprint3.Tarea1.Nivel2.AbstractFactory.AbstractFactory;
import Sprint3.Tarea1.Nivel2.AbstractFactory.PortugalFactory;
import Sprint3.Tarea1.Nivel2.AbstractFactory.SpainFactory;
import Sprint3.Tarea1.Nivel2.Address.Address;
import Sprint3.Tarea1.Nivel2.Phone.Phone;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    public static void openContacs() {



        System.out.println("Opening Contacts");
        int option = 0;
        do {
            try{
                System.out.println("*************\n" +
                        "PRINCIPAL MENU\n" +
                        "*************\n" +
                        ": \n" +
                        "Choose an option:\n" +
                        "-----------------\n" +
                        "1. Create new contact.\n" +
                        "2. Show contact list.\n" +
                        "3. Exit.\n");

                option = scanner.nextInt();

                scanner.nextLine();

                switch (option) {
                    case 1:
                        System.out.println("Create new contact");
                        createContact();
                        break;
                    case 2:
                        System.out.println("Show contact list");
                        showContacts();
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            } catch (Exception e) {
                System.out.println("Invalid option");
                scanner.next();

            }
        }while (option != 3);
    }

    public static void createContact() {

        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter contact number: ");
        String number = scanner.nextLine();
        System.out.println("Enter contact address: ");
        String address = scanner.nextLine();
        AbstractFactory abstractFactory;
        System.out.println("Enter the country of the contact:");
        String country = scanner.nextLine();
        country = country.toUpperCase();
        if (country.equals("PORTUGAL")) {
            abstractFactory = new PortugalFactory();
        } else if (country.equals("SPAIN")) {
            abstractFactory = new SpainFactory();
        } else {
            System.out.println("Invalid country");
            return;
        }
        Phone phone = abstractFactory.createPhone(number);
        Address addressContact = abstractFactory.createAddress(address);
        Contacts contact = new Contacts(name, phone, addressContact);
        contacts.add(contact);
        System.out.println("Contact created successfully");
    }

    public static void showContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found");
            return;
        }
        for (Contacts contact : contacts) {
            System.out.println(contact.toString());
        }
    }

}
