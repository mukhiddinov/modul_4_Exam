import java.io.IOException;
import java.util.logging.*;

public class Task1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Task1");
        try {
            String fileName = "log.txt";
            ConsoleHandler consoleHandler = new ConsoleHandler();
            FileHandler fileHandler = new FileHandler(fileName, 5000, 1, true);

            SimpleFormatter formatter = new SimpleFormatter();
            consoleHandler.setFormatter(formatter);
            fileHandler.setFormatter(formatter);

            logger.setLevel(Level.INFO);
            consoleHandler.setLevel(Level.INFO);

            logger.addHandler(consoleHandler);
            logger.addHandler(fileHandler);

            logger.severe("ERROR");
            logger.info("INFO");
            logger.warning("WARNING");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}