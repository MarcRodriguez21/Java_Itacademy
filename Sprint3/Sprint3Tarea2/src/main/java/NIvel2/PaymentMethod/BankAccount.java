package NIvel2.PaymentMethod;

public class BankAccount implements PaymentMethod{
    private int accountNumber;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    @Override
    public void pay(int price) {
        System.out.println("Payment by Bank Account " + accountNumber + ": " + price + "€");
    }
}
