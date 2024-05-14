package Vendedor;

import Items.Item;

import java.util.ArrayList;

public class Campesino extends Vendedor {
    private double impuestos = 0.2;
    private double desgaste = 0.15;

    public Campesino(String nombre, String ciudad, Clase Clase, ArrayList<Item> stockVendedor) {
        super(nombre, ciudad, Clase, stockVendedor);
        impuestos = 0.2;
        desgaste = 0.15;
    }
}
