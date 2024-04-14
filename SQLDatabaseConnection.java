//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
* The code is designed to display the connection between mysql database and java code.
The code checks the connection for the database built previously and responds accordingly
*/

public class SQLDatabaseConnection {
    /*
    * The main method executes the program to display whether the database connection has been established or not
    */
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/portfolio_management_system";
        String user = "root";
        String password = "";

        
        try {//searches for the external jar connector
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {//catch lack of driver in the project classpath
            e.printStackTrace();
            return;
        }
        // try catch to connect to database using username and password
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {//catch lack of datbase connectuon
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }
}
