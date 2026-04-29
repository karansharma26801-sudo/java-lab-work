class Book {
    String title;
    double price;

   
    Book() {
        title = "Unknown";
        price = 0.0;
    }

    
    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    
    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Price: " + price);
    }
}


public class p4 {
    public static void main(String[] args) {
        
        Book b1 = new Book();
        b1.display();

        System.out.println();

        
        Book b2 = new Book("Java Programming", 499.99);
        b2.display();
    }
}