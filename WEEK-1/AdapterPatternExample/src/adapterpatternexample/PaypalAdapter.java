package adapterpatternexample;

public class PaypalAdapter implements PaymentProcessor {
    private  PaypalGateway gateway = new PaypalGateway();
    public boolean processPayment(double amount) {
        return gateway.pay(amount);
    }
}
