class Vehicle {
    String vehicleNo;
    String ownerName;

    Vehicle(String vehicleNo, String ownerName) {
        this.vehicleNo = vehicleNo;
        this.ownerName = ownerName;
    }
}


class Car extends Vehicle {
    String model;
    String fuelType;

    Car(String vehicleNo, String ownerName, String model, String fuelType) {
        super(vehicleNo, ownerName); // call parent constructor
        this.model = model;
        this.fuelType = fuelType;
    }

    void display() {
        System.out.println("Vehicle No: " + vehicleNo);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class p3 {
    public static void main(String[] args) {
        Car c = new Car("JK01AB1234", "Karan Sharma", "Swift", "Petrol");
        c.display();
    }
}