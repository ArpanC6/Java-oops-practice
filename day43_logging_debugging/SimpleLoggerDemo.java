import java.util.logging.Logger;

public class SimpleLoggerDemo {

    private static final Logger logger =
            Logger.getLogger(SimpleLoggerDemo.class.getName());

    public static void main(String[] args) {

        logger.info("Application started");
        logger.warning("This is a warning message");
        logger.severe("This is a severe error message");

        logger.info("Application finished");
    }
}
