class DaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

public class p9 {
    public static void main(String[] args) throws InterruptedException {

        DaemonThread t1 = new DaemonThread();
        t1.setName("Daemon Thread");

        t1.setDaemon(true);
        t1.start();

        Thread.sleep(3000);
        System.out.println("Main thread ends.");
    }
}