package entities;

import java.time.LocalDate;

import utils.enums.statustask;

public class task {
    private int id;
    private String title;
    private String description;
    private statustask status;
    private LocalDate duedate;
    private int board_id;
    
    private int task_id;
    public task(int id, String title, String description, statustask status, LocalDate duedate, int board_id,
            int task_id) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.duedate = duedate;
        this.board_id = board_id;
        this.task_id = task_id;
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
    public statustask getStatus() {
        return status;
    }
    public void setStatus(statustask status) {
        this.status = status;
    }
    public LocalDate getDuedate() {
        return duedate;
    }
    public void setDuedate(LocalDate duedate) {
        this.duedate = duedate;
    }
    public int getBoard_id() {
        return board_id;
    }
    public void setBoard_id(int board_id) {
        this.board_id = board_id;
    }
    public int getTask_id() {
        return task_id;
    }
    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    @Override
    public String toString() {
        return "task [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status
                + ", duedate=" + duedate + ", board_id=" + board_id + ", task_id=" + task_id + "]";
    }

}
