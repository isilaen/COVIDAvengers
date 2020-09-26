package com.example.covidavengers;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_home, container, false);
        TextView tv1 = (TextView)layout.findViewById(R.id.welcomeTextView);
        tv1.setText("Welcome, " + User.getInstance().getFirstName()+ ".");

        ImageView healthMeter = (ImageView)layout.findViewById(R.id.imageView2);
        switch (User.getInstance().getSurgeryAch().getCurrLevel()) {
            case 1:
                healthMeter.setImageResource(R.drawable.b1);
                break;
            case 2:
                healthMeter.setImageResource(R.drawable.b2);
                break;
            case 3:
                healthMeter.setImageResource(R.drawable.b3);
                break;
            case 4:
                healthMeter.setImageResource(R.drawable.b4);
                break;
        }
        return layout;
    }
}
