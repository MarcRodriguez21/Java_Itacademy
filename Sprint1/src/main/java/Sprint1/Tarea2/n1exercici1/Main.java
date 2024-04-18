package Sprint1.Tarea2.n1exercici1;

import java.util.function.IntFunction;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Venta sin productos.");
        try {
            Producte[] vacio = new Producte[0];
            Venda venta1 = new Venda(vacio);
            System.out.println(venta1.calcularTotal() + " €");
        } catch (VendaBuidaException  | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Venta con productos.");

        try {
            Producte[] productos = new Producte[2];
            productos[0] = new Producte("Cola",2);
            productos[1]= new Producte("Pan",1);
            Venda venta3 = new Venda(productos);
            System.out.println(venta3.calcularTotal() + " €");

            System.out.println("Añadir producto fuera de indice.");
            Producte producto_out = productos[2];

        } catch (VendaBuidaException  | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
