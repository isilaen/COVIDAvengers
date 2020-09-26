package com.example.covidavengers;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Login page.
 */
public class MainActivity extends AppCompatActivity {

    Button loginBtn;

    /**
     * Called after the current MainActivity object is created.
     * @param savedInstanceState Used to save the current state.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Get the login button from the xml layout file. */
        loginBtn = findViewById(R.id.loginBtn);

        /* Go to the home page when the login button is clicked. */
        loginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                MainActivity.this.startActivity(intent);

            }

        });

    }
}
