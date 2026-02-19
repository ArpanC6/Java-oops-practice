import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnectionTest {

    public static void main(String[] args) {

        /*
         STEP 1: Load JDBC Driver
         Class.forName("com.mysql.cj.jdbc.Driver");
        */

        /*
         STEP 2: Create Connection
         Connection con = DriverManager.getConnection(
                DbConfig.DB_URL,
                DbConfig.USERNAME,
                DbConfig.PASSWORD
         );
        */

        /*
         STEP 3: Create Statement
         Statement stmt = con.createStatement();
        */

        /*
         STEP 4: Execute SQL Query
         stmt.executeQuery("SELECT * FROM students");
        */

        /*
         STEP 5: Close Connection
         con.close();
        */
    }
}