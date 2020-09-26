package com.example.covidavengers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LogCompletedMondayFragment extends Fragment {

    private Button fullLogBtn;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_log_completed_monday, container, false);

        fullLogBtn = layout.findViewById(R.id.fullLogBtn);
        fullLogBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new LogFragment()).commit();

            }

        });

        ImageView doctor1 = (ImageView)layout.findViewById(R.id.mondayDoctor1);
        doctor1.setImageResource(R.drawable.doctorman);

        return layout;
    }
}
