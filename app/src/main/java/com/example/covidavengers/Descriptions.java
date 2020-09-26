package com.example.covidavengers;

public enum Descriptions {
    EXERCISE("Exercise for 30 minutes."),
    VEG("Eat 5 servings of vegetables."),
    FRUIT("Eat 2 servings of fruit.");

    private String desc;

    Descriptions(String desc) {
        this.desc = desc;
    }

    //call for example VEG.getDesc() to get the string
    public String getDesc() {
        return desc;
    }
}
