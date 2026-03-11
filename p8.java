import java.util.*;

public class p8 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList(
            "apple", "banana", "apple", "orange", "banana", "apple"
        );

        System.out.println(countFrequencies(words));
    }

    public static Map<String, Integer> countFrequencies(List<String> words) {

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }
}