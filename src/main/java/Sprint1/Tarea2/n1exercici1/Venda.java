package Sprint1.Tarea2.n1exercici1;

public class Venda {

    private Producte[] productos;
    private int precioTotal = 0;

    public Venda(Producte[] productos) {
        this.productos = productos;

    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int calcularTotal() throws VendaBuidaException {

        try {
            if (productos.length == 0) {
                throw new VendaBuidaException("Per fer una venda primer has d’afegir productes.");
            }else {
                for (Producte producto : productos) {
                    this.precioTotal += producto.getPreu();
                }
            }

            System.out.println("Venta OutOfBounds");
            Producte[] errorOutofBounds = new Producte[1];
            errorOutofBounds[1] = new Producte("Cola",2);

        } catch (VendaBuidaException error) {
            String mensaje = error.getMensaje();

            System.out.println(mensaje);
        } catch (ArrayIndexOutOfBoundsException errorOut) {
            System.out.println("Excepcion Out Of Bounds. " + errorOut.getMessage());

        }

        return precioTotal;

    }
}

