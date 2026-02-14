import java.util.concurrent.CompletableFuture;

public class SimpleAsyncDemo {

    public static void main(String[] args) {

        System.out.println("Main thread: " + Thread.currentThread().getName());

        CompletableFuture.runAsync(() -> {
            System.out.println("Async task running in: "
                    + Thread.currentThread().getName());
        });

        try {
            Thread.sleep(1000); // wait for async task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
