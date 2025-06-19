package adapterpatternexample;

public class AdapterDemo {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PaypalAdapter();
        PaymentProcessor stripe = new StripeAdapter();
        paypal.processPayment(599.99);
        stripe.processPayment(799.50);
    }
}