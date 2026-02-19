package day24_jdbc_mini_project.model.dao;

package day24_jdbc_mini_project.model.dao;

public class StudentDaoImpl implements StudentDao {

    public void addStudent(Student student) {

        /*
         INSERT INTO students (id, name, marks)
         VALUES (?, ?, ?);
        */
    }

    @Override
    public void getAllStudents() {

        /*
         SELECT * FROM students;
         ResultSet loop
        */
    }

    @Override
    public void updateStudentMarks(int id, int marks) {

        /*
         UPDATE students
         SET marks = ?
         WHERE id = ?;
        */
    }

    @Override
    public void deleteStudent(int id) {

        /*
         DELETE FROM students
         WHERE id = ?;
        */
    }

    @Override
    public void addStudent(day12_packages.com.school.student.Student student) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addStudent'");
    }
}