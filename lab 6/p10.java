class LifecycleThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("State inside run: " + Thread.currentThread().getState());
            Thread.sleep(1000); 
        } catch (InterruptedException e) {}
    }
}

public class p10 {
    public static void main(String[] args) throws InterruptedException {
        LifecycleThread t1 = new LifecycleThread();

        // NEW
        System.out.println("State after creation: " + t1.getState());

        // RUNNABLE
        t1.start();
        System.out.println("State after start: " + t1.getState());

        // WAIT
        Thread.sleep(500);
        System.out.println("State during sleep: " + t1.getState());

        // TERMINATED
        t1.join();
        System.out.println("State after completion: " + t1.getState());
    }
}