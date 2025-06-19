package singletonpatternexample;

public class SingletonTest {
    public static void main(String[] args) {
        Logger first = Logger.getInstance();
        Logger second = Logger.getInstance();
        System.out.println("Same instance: " + (first == second));
        first.log("First message");
        second.log("Second message");
    }
}
