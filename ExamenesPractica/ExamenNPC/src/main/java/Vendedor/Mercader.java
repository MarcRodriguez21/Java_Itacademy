package Vendedor;

import Items.Item;

import java.util.ArrayList;

public class Mercader extends Vendedor {
    private double impuestos = 0.04;
    private double desgaste = 0;

    public Mercader(String nombre, String ciudad, Clase clase, ArrayList<Item> stockVendedor) {
        super(nombre, ciudad, clase, stockVendedor);
        impuestos = 0.04;
        desgaste = 0;
    }

}
