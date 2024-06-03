package NIvel2.PaymentMethod;

public class Card implements PaymentMethod {

    private int cardNumber;

    public Card(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int price) {
        System.out.println("Payment by Card with number: " + cardNumber + " and price: " + price);
    }
}
