class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Electronics extends Product {
    int warrantyPeriod; // in months

    
    Electronics(String name, double price, int warrantyPeriod) {
        super(name, price); // initialize parent data
        this.warrantyPeriod = warrantyPeriod;
    }

    double calculateFinalPrice() {
        return price + (price * 0.10);
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warrantyPeriod + " months");
        System.out.println("Final Price (with tax): " + calculateFinalPrice());
    }
}

public class p4 {
    public static void main(String[] args) {
        Electronics e = new Electronics("Laptop", 50000, 24);
        e.display();
    }
}