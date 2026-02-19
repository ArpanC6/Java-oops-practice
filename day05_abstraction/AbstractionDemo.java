abstract class Person {
    String name;

    abstract void work ();

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {

    @Override
    void work() {
        System.out.println("Student is studying..");
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Arpan Chakraborty");
        s1.showName();
        s1.work();
    }
}