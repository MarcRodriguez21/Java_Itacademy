package Nivel3;

import Nivel3.Amazone.Product;

import java.util.ArrayList;

import static Nivel3.Amazone.Amazone.products;

public class ConverterApp {
    private Converter converter ;

    public ConverterApp(Converter converter) {
        this.converter = converter;
    }

    public void convert(ArrayList<Product> products, String currency) {

        for (Product product : products) {
            System.out.println(product.getName() + " " + converter.converter(product.getPrice(), currency) + " " + currency);
        }
    }
}
