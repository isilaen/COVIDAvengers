package com.example.covidavengers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    /* Keys for HomeActivity extras. */
    public static final String PATIENT_NAME = "com.example.covidavengers.PATIENT_NAME";

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /* Retrieve the information passed from the previous activity. */
        Intent intent = getIntent();
        /* Get the the patient's username. */
        String patientName = intent.getStringExtra(PATIENT_NAME);

        /* Do something. */


        bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:

                        break;
                    case R.id.notifications:
                        break;
                    case R.id.achievements:
                        break;
                    case R.id.log:
                        break;
                    case R.id.profile:
                        break;
                }
                return true;
            }
        });

    }

}
