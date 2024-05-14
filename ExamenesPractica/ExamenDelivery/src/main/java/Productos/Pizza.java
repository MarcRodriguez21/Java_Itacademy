package Productos;

public class Pizza extends Producto{

    public Pizza(){
        super(7.9);
        regalo();
    }

    @Override
    public void regalo(){

    }

    @Override
    public String toString() {
        return "Pizza: "
                 + getPrecio() +
                " €.";
    }
}
