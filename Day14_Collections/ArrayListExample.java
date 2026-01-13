import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Arpan");
        students.add("Rahul");
        students.add("Amit");
        students.add("Arpan"); // duplicate allowed

        System.out.println("Student List:");

        for (String name : students) {
            System.out.println(name);
        }
    }
}