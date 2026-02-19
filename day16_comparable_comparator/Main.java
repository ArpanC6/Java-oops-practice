import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3, "Rahul", 78));
        list.add(new Student(1, "Arpan", 90));
        list.add(new Student(2, "Sourav", 85));

        System.out.println("Sorting by ID (Comparable)");
        Collections.sort(list);
        for(Student s : list) s.display();

        System.out.println("\nSorting by Name (Comparator)");
        Collections.sort(list, new SortByName());
        for(Student s : list) s.display();

        System.out.println("\nSorting by Marks (Comparator)");
        Collections.sort(list, new SortByMarks());
        for(Student s : list) s.display();
    }
}