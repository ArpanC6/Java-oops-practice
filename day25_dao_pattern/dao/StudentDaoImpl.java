package day25_dao_pattern.dao;

import jdbc.model.Student;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public void save(Student student) {

        /*
         SQL:
         INSERT INTO students (id, name, marks)
         VALUES (?, ?, ?);
        */
    }

    @Override
    public List<Student> findAll() {

        /*
         SQL:
         SELECT * FROM students;

         Convert ResultSet → List<Student>
        */
        return null;
    }

    @Override
    public Student findById(int id) {

        /*
         SQL:
         SELECT * FROM students WHERE id = ?;
        */
        return null;
    }

    @Override
    public void updateMarks(int id, int marks) {

        /*
         SQL:
         UPDATE students SET marks = ? WHERE id = ?;
        */
    }

    @Override
    public void deleteById(int id) {

        /*
         SQL:
         DELETE FROM students WHERE id = ?;
        */
    }
}