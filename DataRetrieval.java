//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * The class DataRetrieval displays the data manually inserted into the database using java code.
 * The program is used to establish connection to the database and uses statements to execute select query.
 * After this, the data is retrieved and printed in the terminal
 */
public class DataRetrieval {
    /**
     * The main method is used to execute the code in the terminal.
     * The local parameters are first defined after which database connection is established and a query statement is prepared
     * The statement is the executed and  the data is stored in variables and displayed
     * @param args
     */

    public static void main(String[] args) {
        //declaring variables for the database, user and password
        String url = "jdbc:mysql://localhost:3306/portfolio_management_system";
        String user = "root";
        String password = "";
        //declaring query
        String query = "Select * from aboutinfo";

        try{// to handle jdbc driver errors
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            //prints the error
            e.printStackTrace();
            return;
        }
        try(Connection con = DriverManager.getConnection(url, user, password)){// handles database conenction errors
            //creates a statement
            Statement stmt = con.createStatement();
            //creates a result set and executes query
            ResultSet rs = stmt.executeQuery(query);
            //iterates through the result set
            while (rs.next()){
                //storing the data into variables
                int infoId = rs.getInt("InfoId");
                String fullName = rs.getString("FullName");
                String title = rs.getString("Title");
                String description = rs.getString("Description");
                //display the information extracted
                System.out.println("infoId "+ "fullName "+ "title "+ "description" );
            }
            //closing the statement
            stmt.close();
        }
        catch (SQLException e){
            //prints the cause of exception
            e.printStackTrace();
        }
    }
}