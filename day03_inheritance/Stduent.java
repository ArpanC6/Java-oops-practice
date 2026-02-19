class Student extends Person {
    int roll;
    int marks;

    void setStudent (int roll, int marks) {
        this.roll = roll;
        this.marks = marks;
    }

    void showPerson (){
       super.showPerson();
        System.out.println("Roll: " + roll);
        System.out.println("Marks: ");
        System.out.println("=============");
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setData("Arpan Chakraborty", 21);
        s1.setStudent(120,85 );
        s1.showPerson();
    }
}