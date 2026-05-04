public class p6 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1};
        int a = 3, b = 0;
        try {
            System.out.println(arr[1]);
            System.out.println(a/b);

        } catch (Exception e) {
            System.out.println("Some error occured");
        } finally {
            System.out.println("Always execute at the end");
        }
    }
}
