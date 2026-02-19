public class Main {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            int result = a / b;
            System.out.println("Resu;t: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero..");
        } catch (Exception e) {

            System.out.println("Some other exception occurred..");

        } finally {
            System.out.println("Program execution completed..");
        }
    }
}