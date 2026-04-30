class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class IssuedBook extends Book {
    String issueDate;
    String returnDate;

    IssuedBook(String title, String author, String issueDate, String returnDate) {
        super(title, author); // initialize parent data
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Return Date: " + returnDate);
    }
}


public class p9 {
    public static void main(String[] args) {
        IssuedBook b = new IssuedBook(
            "Java Programming",
            "James Gosling",
            "01-04-2026",
            "15-04-2026"
        );
        b.display();
    }
}
