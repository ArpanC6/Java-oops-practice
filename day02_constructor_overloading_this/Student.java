class Student {
    String name;
    int roll;
    int marks;

    // Constructor 1
    Student (){
        this.name = "Arpan Chakraborty";
        this.roll = 120;
        this.marks = 78;
    }

    // Constructor 2 
    Student (String name, int roll) {
        this.name = name;
        this.roll = roll;
        this.marks = 98;
    }

        // Constructor 3
        Student (String name, int roll, int marks){
            this.name = name;
            this.roll = roll;
            this.marks = marks;
        }

        void display (){
            System.out.println("Name: " + name);
            System.out.println("Roll: " + roll);
            System.out.println("Marks: " + marks);
            System.out.println("==================");
        }

        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student("Arpan Chakraborty", 10);
            Student s3 = new Student("Arpan Chakraborty", 10, 33);

            s1.display();
            s2.display();
            s3.display();
        }
    }