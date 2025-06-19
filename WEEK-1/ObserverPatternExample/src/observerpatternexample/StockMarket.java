package observerpatternexample;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StockMarket implements Stock {
    private  List<Observer> observers = new CopyOnWriteArrayList<>();
    private double price;

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public double getPrice() {
        return price;
    }

    public void register(Observer o) {
        observers.add(o);
    }

    public void deregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(price);
        }
    }
}