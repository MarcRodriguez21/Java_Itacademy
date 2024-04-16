package Sprint1.Tarea2.n1exercici1;

public class Main {

    public static void main(String[] args) throws VendaBuidaException {
        // TODO Auto-generated method stub


        System.out.println("Venta sin productos.");
        Producte[] vacio = new Producte[0];
        Venda venta1 = new Venda(vacio);
        System.out.println(venta1.calcularTotal() + " €");

        System.out.println("Venta con productos.");
        Producte[] vacio3 = new Producte[2];
        vacio3[0] = new Producte("Cola",2);
        vacio3[1]= new Producte("Pan",1);
        Venda venta3 = new Venda(vacio3);
        System.out.println(venta3.ventaConProductos() + " €");

        System.out.println("Error out of bounds.");
        Producte[] vacio2 = new Producte[1];
        vacio2[0] = new Producte("Cola",2);
        Venda venta2 = new Venda(vacio2);
        System.out.println(venta2.calcularTotal());

    }

}
