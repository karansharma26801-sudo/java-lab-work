class Message {
    String text;

    
    Message(String text) {
        this.text = text;
    }

    
    void displayLength() {
        System.out.println("Length of string: " + text.length());
    }

    
    void displayUppercase() {
        System.out.println("Uppercase: " + text.toUpperCase());
    }
}


public class p7 {
    public static void main(String[] args) {
        Message m1 = new Message("Hello Java");

        m1.displayLength();
        m1.displayUppercase();
    }
}