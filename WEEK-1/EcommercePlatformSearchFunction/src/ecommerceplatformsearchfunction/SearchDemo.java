package ecommerceplatformsearchfunction;
import java.util.*;
import java.util.Arrays;

public class SearchDemo {

    public static Product linearSearch(Product[] data, int id) {
        for (Product p : data) if (p.getProductId() == id) return p;
        return null;
    }

    public static Product binarySearch(Product[] sorted, int id) {
        int lo = 0, hi = sorted.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            int cmp = Integer.compare(sorted[mid].getProductId(), id);
            if (cmp == 0) return sorted[mid];
            if (cmp < 0) lo = mid + 1;
            else hi = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] inventory = {
            new Product(105, "Laptop", "Electronics"),
            new Product(21, "Shoes", "Footwear"),
            new Product(78, "Book", "Books"),
            new Product(302, "Camera", "Electronics"),
            new Product(4, "Watch", "Accessories")
        };

        Product result1 = linearSearch(inventory, 78);
        System.out.println("Linear: " + result1);

        Product[] sorted = Arrays.copyOf(inventory, inventory.length);
        Arrays.sort(sorted, Comparator.comparingInt(Product::getProductId));

        Product result2 = binarySearch(sorted, 78);
        System.out.println("Binary: " + result2);
    }
}
