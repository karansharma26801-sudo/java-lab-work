import java.util.ArrayList;

public class p1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Aman");
        names.add("Priya");
        names.add("Neha");
        names.add("Karan");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}