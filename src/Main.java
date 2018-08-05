import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            User user = new User();
            Connection conn = DBUtils.getConnection();

            System.out.print("Podaj nazwę użytkownika: ");
            user.setUsername(scanner.nextLine());
            System.out.print("Podaj e-mail użytkownika: ");
            user.setEmail(scanner.nextLine());
            System.out.print("Podaj hasło: ");
            user.setPassword(scanner.nextLine());
            System.out.println(user.getId() + ", " + user.getUsername() + ", " + user.getEmail() + ", " + user.getPassword());
            user.saveToDB(conn);
            Connection connection = DBUtils.getConnection();
            User userLoad = User.loadById(connection, 15);

            if (userLoad == null) {
                System.out.println("Nie ma takiego użytkownika o id: ");
            } else {
                System.out.println(userLoad.getId() + ", " + userLoad.getUsername());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        int yourChoice = 0;
//        while (i != 2) {
//            System.out.println("1 - ");
//            i = scanner.nextInt();
//            switch (i) {
//                case 1: // menu admin (add elements in base, delete elements in base, update elments in base, show user by id, by username)
//                    System.out.println("Wybrałeś jeden");
//                    break;
//                case 2: // menu user (add
//                    System.out.println("Wybrałeś dwa");
//                    break;
//
//                default: {
//                    System.out.println("default");
//                }
//            }
//        }
    }
}