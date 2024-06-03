package NIvel2.SneakersShop;

public class Sneakers {
    private String brand;
    private String model;
    private int price;
    private int stock;

    public Sneakers(String brand, String model, int price, int stock) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Brand = " + brand + ", Model = " + model + ", Price = " + price + ", Stock = " + stock;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
