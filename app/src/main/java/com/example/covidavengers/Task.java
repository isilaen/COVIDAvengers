package com.example.covidavengers;

import java.time.LocalDate;

public abstract class Task {
    private static int CURRID = 1;
    private boolean completed;
    private int id;
    private String description;

    //date to be completed on
    private LocalDate day;

    public Task(String description, LocalDate day) {
        this();
        this.description = description;
        this.day = day;
    }

    public Task() {
        completed = false;
        id = CURRID;
        CURRID++;
    }

    public void setCompleted() {
        completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getID() {
        return id;
    }

    public LocalDate getDay() {
        return day;
    }
}
