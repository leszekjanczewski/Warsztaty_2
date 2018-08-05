import java.sql.Connection;
import java.sql.SQLException;

public class Main2 {
    public static void main(String[] args) {


            Connection conn = DBUtils.getConnection();
//            User user = new User("ala", "ma@kota", "alamakota");

            try {
//                user.saveToDB(conn);
//                System.out.println(user.getId());
//                System.out.println(user.getUsername());
//                System.out.println(user.getEmail());
//                System.out.println(user.getPassword());

                for (User ele : User.loadAll(conn)) {
                System.out.println((char)27 + "[33m" + ele.getId() + ", " + ele.getUsername() + ", " + ele.getEmail() + ", " + ele.getPassword());
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

    }
}
