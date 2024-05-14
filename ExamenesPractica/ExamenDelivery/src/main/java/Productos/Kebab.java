package Productos;

public class Kebab extends Producto{

    public Kebab(){
        super(4.5);
        regalo();
    }

    @Override
    public void regalo(){

    }

    @Override
    public String toString() {
        return "Kebab:" + getPrecio() +
                " €.";
    }
}
