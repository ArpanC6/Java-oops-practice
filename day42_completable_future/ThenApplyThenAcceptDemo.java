import java.util.concurrent.CompletableFuture;

public class ThenApplyThenAcceptDemo {

    public static void main(String[] args) {

        CompletableFuture
                .supplyAsync(() -> 5)
                .thenApply(result -> result * 2)
                .thenAccept(finalResult ->
                        System.out.println("Final Result: " + finalResult)
                );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
