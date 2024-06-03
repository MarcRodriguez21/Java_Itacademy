package NIvel2.PaymentMethod;

public class PaymentGateway {

    public void pay(PaymentMethod paymentMethod, int price) {
        paymentMethod.pay(price);
    }
}
