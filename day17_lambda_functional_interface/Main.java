public class Main {
    public static void main(String[] args) {

        // Lambda Expression
        MyFunctionalInterface obj = () -> {
            System.out.println("Hello from Lambda Expression..");
        };

        obj.show();
    }
}