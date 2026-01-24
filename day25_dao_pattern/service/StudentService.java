package day25_dao_pattern.service;

package jdbc.service;

import jdbc.dao.StudentDao;
import jdbc.dao.StudentDaoImpl;
import jdbc.model.Student;

import java.util.List;

public class StudentService {

    private StudentDao studentDao = new StudentDaoImpl();

    public void registerStudent(Student student) {
        studentDao.save(student);
    }

    public List<Student> getStudents() {
        return studentDao.findAll();
    }

    public Student getStudent(int id) {
        return studentDao.findById(id);
    }

    public void updateStudentMarks(int id, int marks) {
        studentDao.updateMarks(id, marks);
    }

    public void removeStudent(int id) {
        studentDao.deleteById(id);
    }
}