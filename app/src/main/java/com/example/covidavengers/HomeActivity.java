package com.example.covidavengers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    /* Keys for HomeActivity extras. */
    public static final String PATIENT_NAME = "com.example.covidavengers.PATIENT_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /* Retrieve the information passed from the previous activity. */
        Intent intent = getIntent();
        /* Get the the patient's username. */
        String patientName = intent.getStringExtra(PATIENT_NAME);

        /* Do something. */

    }
}
