package day24_jdbc_mini_project.model.dao;

package day24_jdbc_mini_project.model.dao;

import day12_packages.com.school.student.Student;

public interface StudentDao {

    void addStudent(day24_jdbc_mini_project.model.Student student);
    void getAllStudents();
    void updateStudentMarks(int id, int marks);
    void deleteStudent(int id);
    void addStudent(day24_jdbc_mini_project.model.dao.Student student);
}