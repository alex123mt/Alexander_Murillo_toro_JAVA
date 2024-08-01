package entities;

public class Board {
    private int id;
    private String title;
    private String description;
    private int user_id;
    public Board(int id, String title, String description, int user_id) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.user_id = user_id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    @Override
    public String toString() {
        return "{id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", user_id=" + user_id + "}";
    }
    
}
