class Order {
    int orderId;
    double amount;

    Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }
}

class OnlineOrder extends Order {
    double deliveryCharge;

    OnlineOrder(int orderId, double amount, double deliveryCharge) {
        super(orderId, amount); // initialize parent data
        this.deliveryCharge = deliveryCharge;
    }

    double calculateFinalBill() {
        return amount + deliveryCharge;
    }

    void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: " + amount);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Final Bill: " + calculateFinalBill());
    }
}

public class p8 {
    public static void main(String[] args) {
        OnlineOrder o = new OnlineOrder(101, 500, 50);
        o.display();
    }
}