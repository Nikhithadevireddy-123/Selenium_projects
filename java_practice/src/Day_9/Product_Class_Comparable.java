package Day_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Product implements Comparable<Product> {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public int compareTo(Product p) {
        return Double.compare(this.price, p.price);
    }
    public String toString() {
        return name + " " + price;
    }
}
public class Product_Class_Comparable {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("laptop", 38000));
        list.add(new Product("phone", 15000));
        list.add(new Product("tablet", 7600));

        Collections.sort(list); 

        for (Product p : list) {
            System.out.println(p);
        }
    }
}




