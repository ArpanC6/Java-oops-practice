import java.util.concurrent.CompletableFuture;

public class SupplyAsyncDemo {

    public static void main(String[] args) {

        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> {
                    return 10 + 20;
                });

        future.thenAccept(result ->
                System.out.println("Result: " + result)
        );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
