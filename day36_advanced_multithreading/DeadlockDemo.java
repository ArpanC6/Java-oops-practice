class A {}
class B {}

public class DeadlockDemo {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        Thread t1 = new Thread(() -> {
            synchronized (a) {
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (b) {
                    System.out.println("Thread 1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (b) {
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (a) {
                    System.out.println("Thread 2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
