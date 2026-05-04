class ChildThread extends Thread {

    @Override
public void run() {
       for (int i = 1; i<=5; i++) {
System.out.println("Child Thread : " + i);
      }
    }
  }
  public class p4 {
  public static void main(String[] args) {
  ChildThread t1 = new ChildThread();
  t1.start();
   try {
     t1.join();
       } catch (InterruptedException e) {
 System.out.println(e);
 }
 System.out.println("Main Thread Resumes execution ");
    }
}