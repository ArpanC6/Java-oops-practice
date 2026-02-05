import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int task = i;
            pool.execute(() ->
                System.out.println("Task " + task +
                        " executed by " + Thread.currentThread().getName())
            );
        }

        pool.shutdown();
    }
}
