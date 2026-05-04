
class Buffer {
    int data;
    boolean available = false;

    synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait(); 
        }
        data = value;
        System.out.println("Produced: " + value);
        available = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!available) {
            wait(); 
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

public class p7 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.produce(i);
                } catch (InterruptedException e) {System.out.println(e.getMessage());}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.consume();
                } catch (InterruptedException e) {System.out.println(e.getMessage());}
            }
        });

        producer.start();
        consumer.start();
    }
}
