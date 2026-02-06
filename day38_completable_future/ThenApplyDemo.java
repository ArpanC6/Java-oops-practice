import java.util.concurrent.CompletableFuture;

public class ThenApplyDemo {

    public static void main(String[] args) {

        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> 10)
                        .thenApply(result -> result * 2);

        future.thenAccept(System.out::println);
    }
}
