package com.example.covidavengers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NotificationsFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_notifications, container, false);

        ImageView doctor1 = (ImageView)layout.findViewById(R.id.doctor1);
        doctor1.setImageResource(R.drawable.doctorlady);

        ImageView doctor2 = (ImageView)layout.findViewById(R.id.doctor2);
        doctor2.setImageResource(R.drawable.doctorman);

        return layout;
    }
}
