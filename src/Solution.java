import java.util.Date;

public class Solution {
    private int id;
    private Date created;     // przechowyanie daty utworzenia - tylko raz zmodyfikowana
    private Date update;      // przechowywanie daty modyfikacji - modyfikowana za każdym razem
    private String description; // opis rozwiązania
    private int exersiseId;     // klucz obcy - identyfikator ćwiczenia
    private int userId;         // klucz obcy - identyfikator użytkownika

    public Solution(Date created, Date update, String description, int exersiseId, int userId) {
        this.created = created;
        this.update = update;
        this.description = description;
        this.exersiseId = exersiseId;
        this.userId = userId;
    }

    public Solution(int id, Date created, Date update, String description, int exersiseId, int userId) {
        this.id = id;
        this.created = created;
        this.update = update;
        this.exersiseId = exersiseId;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getExersiseId() {
        return exersiseId;
    }

    public void setExersiseId(int exersiseId) {
        this.exersiseId = exersiseId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void loadAll() {

    }



    public void loadById(int id) {

    }

    public void delete(int id) {

    }

    public void saveToDB(String created, String update, String description, int exersiseId, int userId) {
        
    }
}
