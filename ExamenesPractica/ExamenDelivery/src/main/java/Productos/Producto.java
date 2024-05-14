package Productos;

public abstract class Producto {

    protected double precio;

    public Producto(double precio){
        this.precio = precio;
    }

    protected abstract void regalo();


    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

}
