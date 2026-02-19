import java.util.concurrent.*;

public class CallableFutureDemo {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 10 + 20;
        };

        Future<Integer> result = executor.submit(task);

        System.out.println("Result: " + result.get());

        executor.shutdown();
    }
}
