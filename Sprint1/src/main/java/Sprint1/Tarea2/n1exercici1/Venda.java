package Sprint1.Tarea2.n1exercici1;

public class Venda {

    private Producte[] productos;
    private int precioTotal;

    public Venda(Producte[] productos) throws VendaBuidaException {
        if (productos.length == 0) {
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes.");
        }
        this.productos = productos;
    }

    public int calcularTotal() throws VendaBuidaException {
        for (Producte producto : productos) {
            this.precioTotal += producto.getPreu();
        }

        return precioTotal;
    }

}

