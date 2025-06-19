package decoratorpatternexample;

public abstract class NotifierDecorator implements Notifier {
    protected final Notifier notifier;
    protected NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
    public void send(String message) {
        notifier.send(message);
    }
}