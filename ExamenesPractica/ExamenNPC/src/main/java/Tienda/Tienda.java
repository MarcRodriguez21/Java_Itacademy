package Tienda;

import Items.Item;
import Vendedor.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

    static Scanner sc = new Scanner(System.in);

    private static Item item1 = new Item("Espada", "Legendario", 100, 100);
    private static Item item2 = new Item("Escudo", "Legendario", 100, 100);
    private static Item item3 = new Item("Arco", "Raro", 50, 100);
    private static Item item4 = new Item("Ballesta", "Comun", 10, 100);
    private static Item item5 = new Item("Hacha", "Especial", 80, 100);
    private static Item item6 = new Item("Pistola", "Comun", 10, 100);
    private static Item item7 = new Item("Cuchillo", "Especial", 80, 100);
    private static Item item8 = new Item("Pico", "Comun", 10, 100);
    private static Item item9 = new Item("Martillo", "Especial", 80, 100);
    private static Item item10 = new Item("Guadaña", "Comun", 10, 100);

    private static Item[] stock = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10};
    private static ArrayList<Vendedor> vendedores = new ArrayList<>();
    private static ArrayList<Item> itemsVendedor = new ArrayList<>();

    public static Vendedor crearVendedor() {
        System.out.println("Dígame el nombre del vendedor:");
        String nombre = sc.nextLine();
        System.out.println("Dígame la ciudad del vendedor:");
        String ciudad = sc.nextLine();
        System.out.println("Dígame la clase del vendedor (Ladron, Mercader, Campesino):");
        String clase = sc.nextLine();
        clase = clase.toUpperCase();
        Vendedor vendedor = new Vendedor(nombre, ciudad, Clase.valueOf(clase), itemsVendedor);
        vendedores.add(vendedor);
        return vendedor;
    }

    public static void mostrarVendedores() {
        if (vendedores.isEmpty()) {
            System.out.println("No hay vendedores");
        }
        for (int i = 0; i < vendedores.size(); i++) {
            System.out.println((i + 1) + ". " + vendedores.get(i).toString());
        }
    }

    private static Vendedor escogerVendedor() {
        System.out.println("Dígame el numero del vendedor:");
        mostrarVendedores();
        int vendedor = sc.nextInt();
        sc.nextLine();
        vendedor--;
        for (int i = 0; i < vendedores.size(); i++) {
            if (vendedor == i) {
                return vendedores.get(i);
            } else {
                System.out.println("Vendedor no encontrado");
                return null;
            }
        }
        return null;
    }

    private static void mostrarItems() {
        if (stock.length == 0) {
            System.out.println("No hay items");
        }
        for (int i = 0; i < stock.length; i++) {
            System.out.println((i + 1) + ". " + stock[i].toString());
        }
    }

    private static Item escogerItem() {
        mostrarItems();
        System.out.println("Dígame el número del item:");
        int item = sc.nextInt();
        item--;
        for (int i = 0; i < stock.length; i++) {
            if (item == i) {
                return stock[i];
            }
        }
        return null;
    }
        public static void añadirItem() {
            Vendedor vendedor = escogerVendedor();
            if (vendedor != null) {
                Item item = escogerItem();
                if(item != null) {
                    vendedor.getStockVendedor().add(item);
                    itemsVendedor.add(item);
                }
            }
        }

    }

