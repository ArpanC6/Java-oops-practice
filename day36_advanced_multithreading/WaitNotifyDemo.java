class SharedResource {

    synchronized void produce() throws InterruptedException {
        System.out.println("Producing...");
        wait(); // wait until notify
        System.out.println("Production resumed");
    }

    synchronized void consume() {
        System.out.println("Consuming...");
        notify();
    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                resource.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(resource::consume);

        producer.start();
        consumer.start();
    }
}
