package com.example.covidavengers;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LogFragment extends Fragment {

    private Button tuesdayBtn;
    private Button completedBtn;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_log, container, false);

        tuesdayBtn = layout.findViewById(R.id.tuesdayBtn);
        tuesdayBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new LogTuesdayFragment()).commit();

            }

        });

        completedBtn = layout.findViewById(R.id.completedBtn);
        completedBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new LogCompletedMondayFragment()).commit();

            }

        });

        ImageView doctor1 = (ImageView)layout.findViewById(R.id.mondayDoctor1);
        doctor1.setImageResource(R.drawable.doctorman);

        ImageView doctor2 = (ImageView)layout.findViewById(R.id.mondayDoctor2);
        doctor2.setImageResource(R.drawable.doctorold);

        return layout;
    }
}
