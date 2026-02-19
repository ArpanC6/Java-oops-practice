import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        List<Integer> numbers =
                IntStream.rangeClosed(1, 20)
                        .boxed()
                        .collect(Collectors.toList());

        System.out.println("Sequential Stream:");
        numbers.stream().forEach(n ->
                System.out.println(n + " : " + Thread.currentThread().getName())
        );

        System.out.println("\nParallel Stream:");
        numbers.parallelStream().forEach(n ->
                System.out.println(n + " : " + Thread.currentThread().getName())
        );
    }
}
