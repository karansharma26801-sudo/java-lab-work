class PriorityThread extends Thread {
public PriorityThread(String name) {
     super(name);
}

@Override
public void run() {
       for (int i = 1; i<=5; i++) {
System.out.println(Thread.currentThread().getName() + " (Priority : " +  Thread.currentThread().getPriority() + ") -> " + i);
      }
    }
  }
  public class p5 {
  public static void main(String[] args) {
  PriorityThread t1 = new PriorityThread("low priority");
  PriorityThread t2 = new PriorityThread("normal priority");
  PriorityThread t3 = new PriorityThread("highest priority");
  t1.setPriority(Thread.MIN_PRIORITY);
  t1.setPriority(Thread.NORM_PRIORITY);
  t1.setPriority(Thread.MAX_PRIORITY);
  t1.start();
  t2.start();
  t3.start();
    }
}
