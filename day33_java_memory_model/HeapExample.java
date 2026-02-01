class Student {
    String name;
    int roll;
}

public class HeapExample {

    public static void main(String[] args) {
        Student s1 = new Student(); // object in heap
        s1.name = "Arpan";
        s1.roll = 1;

        display(s1);
    }

    static void display(Student s) {
        System.out.println(s.name);
    }
}
