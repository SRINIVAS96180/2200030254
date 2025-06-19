package adapterpatternexample;

public class StripeGateway {
    public boolean makePayment(int paise) {
        System.out.println("Stripe processed ₹" + (paise / 100.0));
        return true;
    }
}