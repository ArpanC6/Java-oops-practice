public class GenericExample {
    public static void main(String[] args) {

        Integer number = 10;
        String name = "Arpan";

        printData(number);
        printData(name);
    }

    public static <T> void printData(T data) {
        System.out.println(data);
    }
}
