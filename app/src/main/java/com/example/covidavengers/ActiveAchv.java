package com.example.covidavengers;

/* achievement for how many days in a row you've completed all your exercise */
public class ActiveAchv extends Achievement {

    public ActiveAchv() {
        super();
    }

    public String getLevelName() {
        String name = "";
        switch (this.getCurrLevel()) {
            case 1:
                name = "Try and be active!";
                break;
            case 2:
                name = "Keep up your activity level!";
                break;
            case 3:
                name = "Nearly optimal!";
                break;
            case 4:
                name = "Ready for surgery!";
                break;
        }
        return name;
    }
}
