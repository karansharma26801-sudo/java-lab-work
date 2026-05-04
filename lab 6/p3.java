

class SleepThread extends Thread {
@Override   
public void run() {
       for (int i = 1; i<=10; i++) {
System.out.println("Before sleep : " + i);
      try {
          Thread.sleep(1000);
          } catch (InterruptedException e) {
      System.out.println(e);
         }
      System.out.println("After  sleep : " + i);
      }
    }
  }
  public class p3 {
  public static void main(String[] args) {
  SleepThread t1 = new SleepThread();
  t1.start();
    }
}