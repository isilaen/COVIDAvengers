package com.example.covidavengers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LogFragment extends Fragment {

    private Button mondayBtn;
    private Button tuesdayBtn;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_log, container, false);
//
//        mondayBtn = layout.findViewById(R.id.mondayBtn);
//        tuesdayBtn = layout.findViewById(R.id.tuesdayBtn);
//
//        return layout;
    }
}
