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
        achievements.add(new SurgeryAchv());
        achievements.add(new DietAchv());
        achievements.add(new ActiveAchv());
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

    //your health status is an integer 1 to 4 (4 is very healthy)
    public int getHealthStatus() {
        for (int i = 0; i < achievements.size(); i++) {
            Achievement thisAchv = achievements.get(i);
            if (thisAchv instanceof SurgeryAchv) {
                return thisAchv.getCurrLevel();
            }
        }
        return 0;
    }
}
