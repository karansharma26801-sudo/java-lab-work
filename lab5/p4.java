import java.util.*;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer 1 value: ");
        String input0 = sc.nextLine().trim();
        System.out.print("Enter integer 2 value: ");
        String input1 = sc.nextLine().trim();
        try {
            int num1 = Integer.parseInt(input0);
            int num2 = Integer.parseInt(input1);
            System.out.println("You entered : " + input0 + "\t and " + input1);
            System.out.println("num1 divide by num2 : " + num1/num2);
        } catch (NumberFormatException e) {
            System.out.println("Error: You entered a non numeric value");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero ");
        }
    }

}