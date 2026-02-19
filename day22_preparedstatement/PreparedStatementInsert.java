package jdbc;

public class PreparedStatementInsert {

    public static void main(String[] args) {

        /*
         SQL Query with placeholders
         ---------------------------
         INSERT INTO students (id, name, marks)
         VALUES (?, ?, ?);
        */

        /*
         PreparedStatement steps:

         1. Prepare SQL query
         2. Set values using:
            - setInt()
            - setString()
         3. Execute update
        */

        /*
         Example values:
         id = 1
         name = "Arpan"
         marks = 90
        */
    }
}