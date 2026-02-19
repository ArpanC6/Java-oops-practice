class Resource {}

public class DeadlockFixDemo {

    public static void main(String[] args) {

        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                synchronized (r2) {
                    System.out.println("Thread 1 safe");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (r1) {
                synchronized (r2) {
                    System.out.println("Thread 2 safe");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
