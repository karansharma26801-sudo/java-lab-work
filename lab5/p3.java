import java.util.*;


public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        String input = sc.nextLine().trim();
        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: You entered a non numeric value");
        }
    }

}