package com.example.covidavengers;

import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;

    private boolean preSurgery;

    private ArrayList<Task> allTasks;

    private ArrayList<Achievement> achievements;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        achievements = new ArrayList<Achievement>();
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return (firstName + " " + lastName);
    }

    public boolean isPreSurgery() {
        return preSurgery;
    }
}
