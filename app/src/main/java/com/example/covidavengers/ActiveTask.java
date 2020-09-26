package com.example.covidavengers;

import java.time.LocalDate;

public class ActiveTask extends Task {

    public ActiveTask(String description, LocalDate day) {
        super(description, day);
    }

    public ActiveTask() {
        super();
    }
}
