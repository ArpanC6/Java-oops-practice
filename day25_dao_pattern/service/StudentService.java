package day25_dao_pattern.service;


import java.util.List;

import jdbc.dao.StudentDao;

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