package com.example.buddystudy.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.buddystudy.Activities.MainActivity;
import com.example.buddystudy.R;

public class StartFragment extends Fragment {

    //widgets
    private Button editStudySetButton;
    private Button startStudyButton;

    private TextView testText;

    //getting new instances
    public static StartFragment newInstance() {

        Bundle args = new Bundle();

        StartFragment fragment = new StartFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.start_fragment, container, false);

        wireWidgets(v);
        setClickListeners(v);

        return v;
    }

    private void setClickListeners(View v) {

        //turn on the listeners
//        editStudySetButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                MainActivity.switchToEditStudySetFrag();
//            }
//        });
//
//        startStudyButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                MainActivity.switchToStudyGameFrag();
//            }
//        });
    }

    private void wireWidgets(View v) {
//        editStudySetButton = v.findViewById(R.id.edit_study_sets_button);
//        startStudyButton = v.findViewById(R.id.start_study_button);
//
//        testText = v.findViewById(R.id.start_test_text);
    }
}
