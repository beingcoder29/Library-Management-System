
package project;
import java.sql.*;
/**
 *
 * @author arkap
 */
public class connectionpro {  //database connection...
    public static Connection getCon(){
        try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/lms","root","admin");
          return con;
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return null;
                 
        }
    }
}
