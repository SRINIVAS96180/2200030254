package proxypatternexample;

public class ProxyDemo {
    public static void main(String[] args) {
        Image first = new ProxyImage("photo1.png");
        Image second = new ProxyImage("photo1.png");
        first.display();
        second.display();
    }
}