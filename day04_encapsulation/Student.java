class Student {

    private String name;
    private int roll;
    private int marks;

    
    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    
    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public int getMarks() {
        return marks;
    }

   
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }

   
    public static void main(String[] args) {
        Student s1 = new Student();

       
        s1.setName("Arpan Chakraborty");
        s1.setRoll(120);
        s1.setMarks(85);

        
        System.out.println("Using Getters:");
        System.out.println(s1.getName());
        System.out.println(s1.getRoll());
        System.out.println(s1.getMarks());

        System.out.println();

        s1.display();
    }
}