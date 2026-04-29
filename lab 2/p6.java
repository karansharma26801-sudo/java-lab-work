class Car {
    String brand;
    double price;

    
    Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    
    void display() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Price: " + price);
    }
}


public class p6 {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 800000);
        c1.display();
    }
}