import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // WRITE TO FILE
        try {
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Hello Java File Handling\n");
            writer.write("This is Day 11 practice");
            writer.close();
            System.out.println("Data written to file successfully");
        } catch (IOException e) {
            System.out.println("Error while writing to file");
        }

        // READ FROM FILE
        try {
            FileReader reader = new FileReader("data.txt");
            int ch;
            System.out.println("\nReading from file:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error while reading from file");
        }
    }
}