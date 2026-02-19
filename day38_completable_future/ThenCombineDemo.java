import java.util.concurrent.CompletableFuture;

public class ThenCombineDemo {

    public static void main(String[] args) {

        CompletableFuture<Integer> f1 =
                CompletableFuture.supplyAsync(() -> 20);

        CompletableFuture<Integer> f2 =
                CompletableFuture.supplyAsync(() -> 30);

        f1.thenCombine(f2, Integer::sum)
          .thenAccept(result ->
                System.out.println("Final Result: " + result));
    }
}
