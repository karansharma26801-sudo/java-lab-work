import java.util.*;

public class p6 {
    public static void main(String[] args) {

       List<String> names = new ArrayList<>(Arrays.asList("Rahul", "Aman", "Priya", "Neha", "Karan"));

        Collections.reverse(names);

        System.out.println("Reversed List: " + names);
    }
}