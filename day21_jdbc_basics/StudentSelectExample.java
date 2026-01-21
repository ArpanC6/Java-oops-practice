package jdbc;

import java.sql.ResultSet;

public class StudentSelectExample {

    public static void main(String[] args) {

        /*
         SQL Query (MySQL)
         -----------------
         SELECT id, name, marks
         FROM students;
        */

        /*
         ResultSet working concept:

         while (rs.next()) {
             int id = rs.getInt("id");
             String name = rs.getString("name");
             int marks = rs.getInt("marks");

             System.out.println(id + " | " + name + " | " + marks);
         }
        */

        /*
         Output Example:
         ---------------
         1 | Arpan | 90
         2 | Rahul | 85
        */
    }
}