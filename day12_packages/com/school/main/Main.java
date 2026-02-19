package day12_packages.com.school.main;

import day12_packages.com.school.student.Student;

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Arpan", 10, 85);

        System.out.println(s.name);
        s.display();
    }
}