public class SimpleTask implements Runnable {

    private final String taskName;

    public SimpleTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(
                taskName + " executed by " +
                Thread.currentThread().getName()
        );
    }
}
