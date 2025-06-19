package decoratorpatternexample;

public class DecoratorDemo {
    public static void main(String[] args) {
        Notifier notifier = new SlackNotifierDecorator(
                                new SMSNotifierDecorator(
                                    new EmailNotifier()));

        notifier.send("System maintenance tonight at 11 PM");
    }
}