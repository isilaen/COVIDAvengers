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

    private Button mondayBtn;
    private Button tuesdayBtn;
    LinearLayout mondayTasks;
    LinearLayout tuesdayTasks;

    private Button mapBtn;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_log, container, false);

//        mondayTasks = layout.findViewById(R.id.mondayTasks);
//        mondayTasks = layout.findViewById(R.id.mondayTasks);
//        tuesdayTasks.setVisibility(View.GONE);
//
//        mondayBtn = layout.findViewById(R.id.mondayBtn);
//        mondayBtn.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//
//                tuesdayTasks.setVisibility(View.GONE);
//                mondayTasks.setVisibility(View.VISIBLE);
//
//            }
//
//        });
//
//        tuesdayBtn = layout.findViewById(R.id.tuesdayBtn);
//        tuesdayBtn.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//
//                tuesdayTasks.setVisibility(View.VISIBLE);
//                mondayTasks.setVisibility(View.GONE);
//
//            }
//
//        });

        ImageView doctor1 = (ImageView)layout.findViewById(R.id.mondayDoctor1);
        doctor1.setImageResource(R.drawable.doctorman);

        ImageView doctor2 = (ImageView)layout.findViewById(R.id.mondayDoctor2);
        doctor2.setImageResource(R.drawable.doctorold);

        mapBtn = layout.findViewById(R.id.mapBtn);
        mapBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            Intent intent = new Intent(getActivity(), MapsActivity.class);
            startActivity(intent);

            }

        });

        return layout;
    }
}
