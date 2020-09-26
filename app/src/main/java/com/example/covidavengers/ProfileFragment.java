package com.example.covidavengers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_profile, container, false);

        TextView name = (TextView)layout.findViewById(R.id.nameTextView);
        name.setText(User.getInstance().getFirstName());

        TextView age = (TextView)layout.findViewById(R.id.ageTextView);
        age.setText("Age: " + Integer.toString(User.getInstance().getAge()));

        TextView weight = (TextView)layout.findViewById(R.id.weightValueTextView);
        weight.setText(Integer.toString(User.getInstance().getWeight()));

        TextView glucose = (TextView)layout.findViewById(R.id.glucoseValueTextView);
        glucose.setText(Integer.toString(User.getInstance().getGlucose()));

        TextView bloodPressure = (TextView)layout.findViewById(R.id.pressureValueTextView);
        bloodPressure.setText(Integer.toString(User.getInstance().getBloodPressure()));

        ImageView aAch = (ImageView)layout.findViewById(R.id.achievement1Img);
        switch (User.getInstance().getActiveAch().getCurrLevel()) {
            case 1:
                aAch.setImageResource(R.drawable.a1);
                break;
            case 2:
                aAch.setImageResource(R.drawable.a2);
                break;
            case 3:
                aAch.setImageResource(R.drawable.a3);
                break;
            case 4:
                aAch.setImageResource(R.drawable.a4);
                break;
        }
        TextView aAchText = (TextView)layout.findViewById(R.id.achievement1TextView);
        aAchText.setText(User.getInstance().getActiveAch().getLevelName());

        ImageView dAch = (ImageView)layout.findViewById(R.id.achievement2Img);
        switch (User.getInstance().getDietAch().getCurrLevel()) {
            case 1:
                dAch.setImageResource(R.drawable.d1);
                break;
            case 2:
                dAch.setImageResource(R.drawable.d2);
                break;
            case 3:
                dAch.setImageResource(R.drawable.d3);
                break;
            case 4:
                dAch.setImageResource(R.drawable.d4);
                break;
        }
        TextView dAchText = (TextView)layout.findViewById(R.id.achievement2TextView);
        dAchText.setText(User.getInstance().getDietAch().getLevelName());

        ImageView sAch = (ImageView)layout.findViewById(R.id.achievement3Img);
        switch (User.getInstance().getSurgeryAch().getCurrLevel()) {
            case 1:
                sAch.setImageResource(R.drawable.s1);
                break;
            case 2:
                sAch.setImageResource(R.drawable.s2);
                break;
            case 3:
                sAch.setImageResource(R.drawable.s3);
                break;
            case 4:
                sAch.setImageResource(R.drawable.s4);
                break;
        }
        TextView sAchText = (TextView)layout.findViewById(R.id.achievement3TextView);
        sAchText.setText(User.getInstance().getSurgeryAch().getLevelName());

        ImageView profile = (ImageView)layout.findViewById(R.id.profile_image);
        profile.setImageResource(R.drawable.profile);
        return layout;
    }
}
