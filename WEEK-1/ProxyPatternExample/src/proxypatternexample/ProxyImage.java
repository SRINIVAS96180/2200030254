package proxypatternexample;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ProxyImage implements Image {
    private static  Map<String, RealImage> cache = new ConcurrentHashMap<>();
    private  String file;
    public ProxyImage(String file) {
        this.file = file;
    }
    public void display() {
        RealImage img = cache.computeIfAbsent(file, RealImage::new);
        img.display();
    }
}