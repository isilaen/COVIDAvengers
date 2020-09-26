package com.example.covidavengers;

public abstract class Achievement {
    private int currLevel;
    //how close you are to the next level
    private int percentage;

    public static final int MAXLEVEL = 4;

    public Achievement() {
        currLevel = 1;
        percentage = 0;
    }

    public int getCurrLevel() {
        return currLevel;
    }
    public int getPercentage() {
        return percentage;
    }

    public void incrementLevel() {
        if (currLevel != MAXLEVEL) {
            currLevel++;
        }
    }

    public String getLevelName() {
        return "";
    }
}
