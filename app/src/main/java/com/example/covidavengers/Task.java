package com.example.covidavengers;

public abstract class Task {
    private static int CURRID = 1;
    private boolean completed;
    private int id;
    private String description;

    public Task(String description) {
        this();
        this.description = description;
    }

    public Task() {
        completed = false;
        id = CURRID;
        CURRID++;
    }

    public void setCompleted() {
        completed = true;
    }

    public int getID() {
        return id;
    }
}
