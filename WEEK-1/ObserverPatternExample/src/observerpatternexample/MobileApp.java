package observerpatternexample;

public class MobileApp implements Observer {
    public void update(double price) {
        System.out.println("Mobile app shows price: ₹" + price);
    }
}
