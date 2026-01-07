public class Person {

    static String country = "India"; 
    String name;

    Person(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Name: " + name);
    }
}