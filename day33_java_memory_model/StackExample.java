public class StackExample {

    public static void main(String[] args) {
        int a = 10;        // stored in stack
        int b = 20;

        add(a, b);
    }

    static void add(int x, int y) {
        int sum = x + y;  // stored in stack
        System.out.println(sum);
    }
}
