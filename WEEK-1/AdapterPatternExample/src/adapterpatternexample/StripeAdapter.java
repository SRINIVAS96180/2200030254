package adapterpatternexample;

public class StripeAdapter implements PaymentProcessor {
    private  StripeGateway gateway = new StripeGateway();
    public boolean processPayment(double amount) {
        int paise = (int) (amount * 100);
        return gateway.makePayment(paise);
    }
}
