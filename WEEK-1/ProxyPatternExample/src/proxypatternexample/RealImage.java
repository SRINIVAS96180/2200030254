package proxypatternexample;

public class RealImage implements Image {
    private String file;
    public RealImage(String file) {
        this.file = file;
        System.out.println("Fetching " + file + " from remote server");
    }
    public void display() {
        System.out.println("Displaying " + file);
    }
}