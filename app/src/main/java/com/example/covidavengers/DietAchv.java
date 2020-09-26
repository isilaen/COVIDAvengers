package com.example.covidavengers;

/* achievement for how many days in a row you've completed all your diet tasks */
public class DietAchv extends Achievement {

    public String getLevelName() {
        String name = "";
        switch (this.getCurrLevel()) {
            case 1:
                name = "Try and eat any healthy foods!";
                break;
            case 2:
                name = "More healthy foods!";
                break;
            case 3:
                name = "Keep eating healthily!";
                break;
            case 4:
                name = "Optimal diet!";
                break;
        }
        return name;
    }
}
