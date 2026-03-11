import java.util.*;

public class p3 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Rahul", "Aman", "Priya", "Neha", "Karan"));

        String target = "Priya";

        if (names.contains(target)) {
            System.out.println(target + " is present in the list.");
        } else {
            System.out.println(target + " is not present in the list.");
        }
    }
}

