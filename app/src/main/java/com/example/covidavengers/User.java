package com.example.covidavengers;

import java.time.LocalDate;
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

    public void completeTask(int taskID) {
        for (int i = 0; i < allTasks.size(); i++) {
            Task thisTask = allTasks.get(i);
            int id = thisTask.getID();
            if (id == taskID) {
                thisTask.setCompleted();
            }
        }
    }

    public void addTask(Task task) {
        allTasks.add(task);
    }

    //returns completed tasks
    public ArrayList<Task> getCompletedTasks() {
        ArrayList<Task> completed = new ArrayList<Task>();
        for (int i = 0; i < allTasks.size(); i++) {
            Task thisTask = allTasks.get(i);
            if (thisTask.isCompleted()) {
                completed.add(thisTask);
            }
        }
        return completed;
    }

    //returns incomplete tasks
    public ArrayList<Task> getCurrentTasks() {
        ArrayList<Task> current = new ArrayList<Task>();
        for (int i = 0; i < allTasks.size(); i++) {
            Task thisTask = allTasks.get(i);
            if (!thisTask.isCompleted()) {
                current.add(thisTask);
            }
        }
        return current;
    }

    public ArrayList<Task> getTodaysTasks() {
        LocalDate today = LocalDate.now();
        ArrayList<Task> todaysTasks = new ArrayList<Task>();
        for (int i = 0; i < allTasks.size(); i++) {
            Task thisTask = allTasks.get(i);
            if (thisTask.getDay().equals(today)) {
                todaysTasks.add(thisTask);
            }
        }
        return todaysTasks;
    }
}
