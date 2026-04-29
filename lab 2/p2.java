class Rectangle {
    double length;
    double width;

    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    void displayArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}


public class p2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        r1.displayArea();
    }
}