package adapterpatternexample;

public class PaypalGateway {
    public boolean pay(double amount) {
        System.out.println("Paypal processed ₹" + amount);
        return true;
    }
}
