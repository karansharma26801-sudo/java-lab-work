import java.util.*;

public class p7 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(30, 10, 50, 20, 40));

        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers);
    }
}
