package NIvel2.PaymentMethod;

public class Paypal implements PaymentMethod {

    private String email;

    public Paypal(String email) {
        this.email = email;
    }
    @Override
    public void pay(int price) {
        System.out.println("Payment by Paypal " + email + " for " + price + "€");
    }
}
