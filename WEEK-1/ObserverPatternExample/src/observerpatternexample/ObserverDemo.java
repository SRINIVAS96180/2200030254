package observerpatternexample;

public class ObserverDemo {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);

        market.setPrice(1465.50);
        market.setPrice(1490.75);

        market.deregister(web);

        market.setPrice(1502.00);
    }
}
