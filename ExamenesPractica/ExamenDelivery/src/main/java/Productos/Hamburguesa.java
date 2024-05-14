package Productos;

public class Hamburguesa extends Producto {

    public Hamburguesa(){
        super(8.9);
        regalo();
    }

    @Override
    public void regalo(){
        System.out.println("Se te regala una gorra por la compra de una hamburguesa!");
    }

    @Override
    public String toString() {
        return "Hamburguesa:" + getPrecio() +
                " €." + " Como regalo, se te regala una gorra por la compra de una hamburguesa!";
    }
}
