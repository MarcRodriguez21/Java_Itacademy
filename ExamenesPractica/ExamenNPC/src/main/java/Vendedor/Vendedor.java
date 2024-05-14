package Vendedor;

import Items.Item;

import java.util.ArrayList;

public class Vendedor {

    private String nombre;
    private String ciudad;
    private Clase clase;
    private ArrayList<Item> stockVendedor = new ArrayList<>();

    public Vendedor(String nombre, String ciudad, Clase clase, ArrayList<Item> stockVendedor) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.clase = clase;
        this.stockVendedor = stockVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Item> getStockVendedor() {
        return stockVendedor;
    }

    public void setStockVendedor(ArrayList<Item> stockVendedor) {
        this.stockVendedor = stockVendedor;
    }

    @Override
    public String toString() {
        return "Vendedor: " +
                "Nombre =" + nombre +
                "| Ciudad = " + ciudad +
                "| Clase = " + clase + "| Stock = " + stockVendedor;
    }

}
