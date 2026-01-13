import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Arpan");
        students.put(2, "Rahul");
        students.put(3, "Amit");

        System.out.println("Student Details:");

        for (int key : students.keySet()) {
            System.out.println("Roll: " + key + ", Name: " + students.get(key));
        }
    }
}