package com.example.covidavengers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LogTuesdayFragment extends Fragment {

    private Button mondayBtn;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_log_tuesday, container, false);

        mondayBtn = layout.findViewById(R.id.mondayBtn);
        mondayBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new LogFragment()).commit();

            }

        });

        ImageView doctor1 = (ImageView)layout.findViewById(R.id.tuesdayDoctor1);
        doctor1.setImageResource(R.drawable.doctorold);

        ImageView doctor2 = (ImageView)layout.findViewById(R.id.tuesdayDoctor2);
        doctor2.setImageResource(R.drawable.doctorold); // Doctor Mabuse

        ImageView doctor3 = (ImageView)layout.findViewById(R.id.tuesdayDoctor3);
        doctor3.setImageResource(R.drawable.doctorman); // Doctor Hyde

        return layout;
    }
}
