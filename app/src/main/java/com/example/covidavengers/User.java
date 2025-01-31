package com.example.covidavengers;

import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    //singleton
    private static User instance;

    private static final String SAMPLE_FIRST_NAME = "Jenny";
    private static final String SAMPLE_LAST_NAME = "Crawford";
    private static final int SAMPLE_AGE = 65;
    private static final int SAMPLE_WEIGHT = 70;
    private static final int SAMPLE_GLUCOSE = 75;
    private static final int SAMPLE_BLOOD_PRESSURE = 82;

    private String firstName;
    private String lastName;

    private int age;

    private int weight;
    private int glucose;
    private int bloodPressure;

    //how many days they've been active/followed the nutrition stuff
    private int dietStreak;
    private int activeStreak;

    private boolean preSurgery;

    private ArrayList<Task> allTasks;

    private LocalDate currDay;

    Achievement sAch;
    Achievement aAch;
    Achievement dAch;

    public User(String firstName, String lastName, int age, int weight,
                int glucose, int bloodPressure) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.glucose = glucose;
        this.bloodPressure = bloodPressure;

        sAch = new SurgeryAchv();
        aAch = new ActiveAchv();
        dAch = new DietAchv();
        dietStreak = 0;
        activeStreak = 0;
        currDay = LocalDate.now();
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
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public int getGlucose() {
        return glucose;
    }
    public int getBloodPressure() {
        return bloodPressure;
    }

    public boolean isPreSurgery() {
        return preSurgery;
    }

    //your health status is an integer 1 to 4 (4 is very healthy)
    public int getHealthStatus() {
        return sAch.getCurrLevel();
    }

    public void completeTask(int taskID) {
        for (int i = 0; i < allTasks.size(); i++) {
            Task thisTask = allTasks.get(i);
            int id = thisTask.getID();
            if (id == taskID) {
                thisTask.setCompleted();

                updateStreaks();
                return;
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

    //checks if a user has completed all their active tasks for today
    private boolean allActiveCompletedToday() {
        LocalDate today = LocalDate.now();
        for (int i = 0; i < allTasks.size(); i++) {
            Task thisTask = allTasks.get(i);
            if ((!thisTask.isCompleted()) && (thisTask.getDay().equals(today)) && (thisTask instanceof ActiveTask)) {
                return false;
            }
        }
        return true;
    }

    //checks if a user has completed all their diet tasks for today
    private boolean allDietCompletedToday() {
        LocalDate today = LocalDate.now();
        for (int i = 0; i < allTasks.size(); i++) {
            Task thisTask = allTasks.get(i);
            if ((!thisTask.isCompleted()) && (thisTask.getDay().equals(today)) && (thisTask instanceof DietTask)) {
                return false;
            }
        }
        return true;
    }

    private void updateStreaks() {
        LocalDate today = LocalDate.now();
        if (today.isAfter(currDay)) {
            //it's a new day
            if (allActiveCompletedToday()) {
                activeStreak++;
                if ((activeStreak % 3 == 0) && (activeStreak != 0)) {
                    aAch.incrementLevel();
                }
            } else {
                activeStreak = 0;
            }
            if (allDietCompletedToday()) {
                dietStreak++;
                if ((dietStreak % 3 == 0) && (dietStreak != 0)) {
                    dAch.incrementLevel();
                }
            } else {
                dietStreak = 0;
            }
            sAch.setLevel((aAch.getCurrLevel() + dAch.getCurrLevel())/2);
            currDay = today;
        }
    }

    public static User getInstance() {
        if (instance == null) {
            instance = new User(SAMPLE_FIRST_NAME, SAMPLE_LAST_NAME, SAMPLE_AGE, SAMPLE_WEIGHT,
                    SAMPLE_GLUCOSE, SAMPLE_BLOOD_PRESSURE);
        }
        return instance;
    }

    public Achievement getSurgeryAch() {
        return sAch;
    }
    public Achievement getActiveAch() {
        return aAch;
    }
    public Achievement getDietAch() {
        return dAch;
    }
}
