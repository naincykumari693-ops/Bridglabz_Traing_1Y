import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}

public class EcommerceSort {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 70000, 4.5));
        products.add(new Product("Phone", 30000, 4.7));
        products.add(new Product("Headphones", 2000, 4.2));

        // Sort by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price:");
        products.forEach(p -> System.out.println(p.name + " " + p.price));

        // Sort by rating (descending)
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        products.forEach(p -> System.out.println(p.name + " " + p.rating));
    }
}