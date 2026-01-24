package day25_dao_pattern.dao;

package jdbc.dao;

import jdbc.model.Student;
import java.util.List;

public interface StudentDao {

    void save(Student student);
    List<Student> findAll();
    Student findById(int id);
    void updateMarks(int id, int marks);
    void deleteById(int id);
}
