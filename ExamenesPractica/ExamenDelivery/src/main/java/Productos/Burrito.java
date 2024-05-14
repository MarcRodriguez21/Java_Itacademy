package Productos;

public class Burrito extends Producto{

    public Burrito(){
        super(6.5);
        regalo();
    }

    @Override
    public void regalo(){
        System.out.println("Se te regala un Pin por la compra de un burrito!");
    }



    @Override
    public String toString() {
        return "Burrito: "
                + getPrecio() +
                " €." + " Como regalo, se te regala un Pin por la compra de un burrito!";
    }

}
