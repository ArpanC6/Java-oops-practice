public class Main {
    public static void main(String[] args) {

        // Thread class object
        MyThread t1 = new MyThread();
        t1.setName("Thread-1");

        // Runnable object
        MyRunnable runnable = new MyRunnable();
        Thread t2 = new Thread(runnable);
        t2.setName("Thread-2");

        // Start threads
        t1.start();
        t2.start();

        System.out.println("Main Thread: " + Thread.currentThread().getName());
    }
}