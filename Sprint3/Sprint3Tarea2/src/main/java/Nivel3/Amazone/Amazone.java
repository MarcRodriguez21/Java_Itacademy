package Nivel3.Amazone;

import Nivel3.ConverterApp;
import Nivel3.CurrencyConverter;

import java.util.ArrayList;

public class Amazone {

    public static ArrayList<Product> products = new ArrayList<>();

    public void start() {

        products.add(new Product("Coca Cola", 1));
        products.add(new Product("Coca Cola Zero", 2));
        products.add(new Product("Coca Cola Light", 1.5));
        products.add(new Product("Coca Cola Light Zero", 1.8));

        CurrencyConverter converter = new CurrencyConverter();
        ConverterApp converterApp = new ConverterApp(converter);


            converterApp.convert(products, "MXN");
            converterApp.convert(products, "USD");
            converterApp.convert(products, "EUR");
            converterApp.convert(products, "GBP");

    }
}
