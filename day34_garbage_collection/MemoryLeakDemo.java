import java.util.ArrayList;
import java.util.List;

public class MemoryLeakDemo {

    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            list.add("Java");
        }
    }
}
