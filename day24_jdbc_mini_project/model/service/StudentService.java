package day24_jdbc_mini_project.model.service;

package day24_jdbc_mini_project.model.service;

import day24_jdbc_mini_project.model.Student;
import day24_jdbc_mini_project.model.dao.StudentDao;
import day24_jdbc_mini_project.model.dao.StudentDaoImpl;

public class StudentService {

    private StudentDao studentDao = new StudentDaoImpl();

    public void addStudentService(day24_jdbc_mini_project.model.dao.Student student) {
        studentDao.addStudent(student);
    }

    public void showStudents() {
        studentDao.getAllStudents();
    }

    public void updateMarks(int id, int marks) {
        studentDao.updateStudentMarks(id, marks);
    }

    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }
}