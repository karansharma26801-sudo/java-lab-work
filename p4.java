import java.util.*;

public class p4 {
    public static void main(String[] args) {

        
        Integer[] arr = {10, 20, 30, 40, 50};

        
        List<Integer> list = Arrays.asList(arr);

        System.out.println("Array converted to List: " + list);

        
        Integer[] newArray = list.toArray(new Integer[0]);

        System.out.println("List converted back to Array:");

        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
