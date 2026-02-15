import java.util.logging.Logger;

public class ExceptionLoggingDemo {

    private static final Logger logger =
            Logger.getLogger(ExceptionLoggingDemo.class.getName());

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            logger.severe("Exception occurred: " + e.getMessage());
        }
    }
}
