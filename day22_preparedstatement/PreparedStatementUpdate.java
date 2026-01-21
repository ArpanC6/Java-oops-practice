package jdbc;

public class PreparedStatementUpdate {

    public static void main(String[] args) {

        /*
         SQL Query
         ---------
         UPDATE students
         SET marks = ?
         WHERE id = ?;
        */

        /*
         Why PreparedStatement?
         - Prevents SQL Injection
         - Better performance
         - Readable code
        */

        /*
         Example:
         marks = 95
         id = 1
        */
    }
}