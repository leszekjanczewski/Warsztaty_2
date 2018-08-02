public class User {
    private int id;
    private String username;
    private String email;
    private String password;

    public User(String userName, String email, String password) {
        this.username = userName;
        this.email = email;
        this.password = password;
    }

    public User(int id, String userName, String email, String password) {
        this.id = id;
        this.username = userName;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void save(String userName, String email, String password) {

    }

    public void update(int id, String userName, String email, String password) {

    }

    public void delete(int id) {

    }

    public void loadAll() {

    }

    public void loadById(int id) {

    }

    public void delete(int id) {

    }

    public void saveToDB(String username, String email, String password) {

    }
}
