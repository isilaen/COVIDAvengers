package com.example.covidavengers;

public abstract class Task {
    private boolean completed;

    public Task() {
        completed = false;
    }

    public void setCompleted() {
        completed = true;
    }
}
