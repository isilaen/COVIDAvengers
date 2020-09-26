package com.example.covidavengers;

public class SurgeryAchv extends Achievement {
    //the final level will be when they are fully "optimised for surgery"


    public String getLevelName() {
        String name = "";
        switch (this.getCurrLevel()) {
            case 1:
                name = "Try as hard as you can!";
                break;
            case 2:
                name = "Keep improving for surgery!";
                break;
            case 3:
                name = "Getting ready for surgery!";
                break;
            case 4:
                name = "Optimised for surgery!";
                break;
        }
        return name;
    }
}