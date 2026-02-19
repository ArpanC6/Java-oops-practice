public class Student extends Person {
    final int roll; 

    Student(String name, int roll) {
        super(name);      
        this.roll = roll;
    }

    void show() {
        super.show();
        System.out.println("Roll: " + roll);
        System.out.println("Country: " + country);
        System.out.println("----------------");
    }
}