import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
    static Connection connection;
    static Statement statement;

    static ResultSet resultSet;

    public static void main(String[] args) throws Exception{

        Class.forName("com.mariadb.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/databaseConnection", "root", "");

        statement = connection.createStatement();
    }
}