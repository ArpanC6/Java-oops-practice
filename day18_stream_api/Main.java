import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        // filter: even numbers
        System.out.println("Even Numbers:");
        numbers.stream()
              .filter(n -> n % 2 == 0)
              .forEach(System.out::println);

        // map: square of numbers
        System.out.println("\nSquare of Numbers:");
        numbers.stream()
               .map(n -> n * n)
               .forEach(System.out::println);

        // sorted
        System.out.println("\nSorted Numbers:");
        numbers.stream()
               .sorted()
               .forEach(System.out::println);

        // count
        long count = numbers.stream()
                            .filter(n -> n > 20)
                            .count();
        System.out.println("\nCount greater than 20: " + count);
    }
}