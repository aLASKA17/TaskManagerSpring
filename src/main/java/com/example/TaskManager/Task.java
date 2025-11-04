package com.example.TaskManager;

public class Task {
    private int id;
    private static int index = 0;
    private String title;
    private String description;
    private boolean completed;


    public int generateId() {
        index++;
        return index;
    }

    Task(String title, String description) {
        this.title = title;
        this.id = generateId();
        this.description = description;
        this.completed = false;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
