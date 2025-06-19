package com.inventory;

import java.util.*;

public class InventoryManager {
    private Map<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(int id, String name, int qty, double price) {
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.setProductName(name);
            p.setQuantity(qty);
            p.setPrice(price);
        }
    }

    public void deleteProduct(int id) {
        inventory.remove(id);
    }

    public void displayInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        InventoryManager m = new InventoryManager();
        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add 2. Update 3. Delete 4. Display 5. Exit");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    int id = s.nextInt();
                    String name = s.next();
                    int qty = s.nextInt();
                    double price = s.nextDouble();
                    m.addProduct(new Product(id, name, qty, price));
                    break;
                case 2:
                    id = s.nextInt();
                    name = s.next();
                    qty = s.nextInt();
                    price = s.nextDouble();
                    m.updateProduct(id, name, qty, price);
                    break;
                case 3:
                    id = s.nextInt();
                    m.deleteProduct(id);
                    break;
                case 4:
                    m.displayInventory();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while (choice != 5);
        s.close();
    }
}
