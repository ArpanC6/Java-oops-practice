class Person {
    String name;
}

public class StackHeapDemo {

    public static void main(String[] args) {
        Person p1 = new Person(); // heap
        p1.name = "Java";

        test(p1);
    }

    static void test(Person p) {
        p.name = "Backend";
    }
}
