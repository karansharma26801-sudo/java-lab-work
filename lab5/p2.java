public class p2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        try {
            for (int a : arr) {
                System.out.println(a);
            }

            System.out.println(arr[6]);
            }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}