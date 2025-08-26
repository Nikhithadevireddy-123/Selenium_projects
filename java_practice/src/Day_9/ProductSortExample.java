package Day_9;

import java.util.*;

class Product1 {
    String name;
    double price;

    Product1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - ₹" + price;
    }
}

public class ProductSortExample {
    public static void main(String[] args) {
        List<Product1> products = new ArrayList<>();
        products.add(new Product1("lipstick", 550));
        products.add(new Product1("eyeliner", 200));
        products.add(new Product1("mascara", 300));

        System.out.println("Original List:");
        products.forEach(System.out::println);
        
        products.sort(Comparator.comparingDouble(p -> p.price));
        System.out.println("\nSorted by Price (Ascending):");
        for (Product1 p : products) {
            System.out.println(p);
        }
        products.sort((p1, p2) -> Double.compare(p2.price, p1.price));
        System.out.println("\nSorted by Price (Descending):");
        for (Product1 p : products) {
            System.out.println(p);
        }
        products.sort(Comparator.comparing(p -> p.name));
        System.out.println("\nSorted by Name (Alphabetically):");
        for (Product1 p : products) {
            System.out.println(p);
        }
    }
}

