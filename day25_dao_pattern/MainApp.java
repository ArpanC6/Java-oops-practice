package day25_dao_pattern;

package jdbc;

import jdbc.model.Student;
import jdbc.service.StudentService;

public class MainApp {

    public static void main(String[] args) {

        /*
         Flow:
         -----
         UI / API
            ↓
         Service
            ↓
         DAO
            ↓
         Database
        */

        /*
         Example calls:
         - registerStudent()
         - getStudents()
         - updateStudentMarks()
         - removeStudent()
        */
    }
}