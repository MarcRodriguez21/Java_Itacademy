package Vendedor;

import Items.Item;

import java.util.ArrayList;

public class Ladron extends Vendedor {
    private double impuestos = 0.0;
    private double desgaste = 0.25;
    public Ladron(String nombre, String ciudad, Clase clase, ArrayList<Item> stockVendedor) {
        super(nombre, ciudad, clase, stockVendedor);
        impuestos = 0.0;
        desgaste = 0.25;
    }
}
