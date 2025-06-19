package observerpatternexample;

public class WebApp implements Observer {
    public void update(double price) {
        System.out.println("Web app shows price: ₹" + price);
    }
}
