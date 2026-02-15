import java.util.logging.Level;
import java.util.logging.Logger;

public class LogLevelDemo {

    private static final Logger logger =
            Logger.getLogger(LogLevelDemo.class.getName());

    public static void main(String[] args) {

        logger.setLevel(Level.ALL);

        logger.fine("FINE log");
        logger.info("INFO log");
        logger.warning("WARNING log");
        logger.severe("SEVERE log");
    }
}
