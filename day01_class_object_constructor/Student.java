class Student {
    String name;
    int roll;
    int marks;

    Student(String n, int r, int m) {
        name = n;
        roll = r;
        marks = m;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Arpan Chakraborty", 101, 50);
        s1.display();
    }
}