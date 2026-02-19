import java.util.concurrent.CompletableFuture;

public class CompletableFutureBasic {

    public static void main(String[] args) {

        CompletableFuture.runAsync(() -> {
            System.out.println("Async task running");
        });

        System.out.println("Main thread continues");
    }
}
