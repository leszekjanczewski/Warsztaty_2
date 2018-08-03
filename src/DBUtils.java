import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
    static private String url = "jdbc:mysql://localhost:3306/warsztaty_2?useSSL=false";
    static private String user = "root";
    static private String password = "coderslab";
    static private Connection conn;

    static public Connection getConnection() {
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.err.println("Brak połączenia z bazą danych");
        }
        return conn;
    }
}
