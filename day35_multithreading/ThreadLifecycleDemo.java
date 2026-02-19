public class ThreadLifecycleDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            System.out.println("Thread started");
        });

        System.out.println(t.getState()); // NEW
        t.start();
        Thread.sleep(100);
        System.out.println(t.getState()); // TERMINATED
    }
}
