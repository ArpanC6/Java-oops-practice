package jdbc;

public class SqlInjectionExample {

    public static void main(String[] args) {

        String username = "admin";
        String password = "' OR '1'='1";

        /*
         Unsafe SQL using Statement
         ---------------------------
         SELECT * FROM users
         WHERE username = 'admin'
         AND password = '' OR '1'='1';
        */

        /*
         Result:
         - Hacker login successful
         - Security breach
        */

        /*
         This happens because:
         - User input is directly concatenated
         - Statement does not prevent SQL Injection
        */
    }
}