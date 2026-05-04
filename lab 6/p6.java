class Counter {
//  public int count = 0;
//  public void increment() { //not thread-safe
//  count++;
public int count = 0;
 synchronized void increment() { //thread-safe
 count++;
  } 
}
  public class p6 {
  public static void main(String[] args) throws InterruptedException {
  Counter c = new Counter();
  Thread t1 = new Thread(() -> {
  for (int i = 0; i<1000; i++) {
  c.increment(); }
});
  Thread t2 = new Thread(() -> {
  for (int i = 0; i<1000; i++) {
  c.increment(); }
});
  t1.start();
  t2.start();

  t1.join();
  t2.join();
  System.out.println("Final Count : " + c.count); //unsynchronized or synchronized 

    }
}
