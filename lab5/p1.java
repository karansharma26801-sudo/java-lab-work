import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter second value : ");
        int b = sc.nextInt();
        sc.nextLine();
        try {
            if (b == 0) {
                throw new ArithmeticException("Not Divisible by zero!");
            } else{
            System.out.println("Division of a by b is " + (a/b));
        }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}