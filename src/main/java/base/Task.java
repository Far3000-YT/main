package base;
import javafx.scene.layout.Priority;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
    private int id;
    private String name;
    private String description;
    private Priority priority;
    private Date dueDate;
    private Status status;
    private Employee assignee;
    private List<String> comments;


    public Task(int id, String name, String description, Priority priority, Date dueDate, Status status, Employee assignee) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = status;
        this.assignee = assignee;
        this.comments = new ArrayList<>();
    }

    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }
    public String getDescription () {
        return description;
    }

    public Priority getPriority () {
        return priority;
    }
    public Date getDueDate () {
        return dueDate;
    }

    public Status getStatus () {
        return status;
    }

    public Employee getAssignee () {
        return assignee;
    }

    public List<String> getComments () {
        return comments;
    }
    public void setStatus (Status status){
        this.status = status;
    }
    public void setAssignee (Employee assignee){
        this.assignee = assignee;
    }
    @Override
    public String toString () {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", dueDate=" + dueDate +
                ", status=" + status +
                ", assignee=" + (assignee != null ? assignee.getName() : "None") +
                ", comments=" + comments +
                '}';

    }
}