package com.example.buddystudy.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.buddystudy.R;

public class StartStudyFragment extends Fragment {

    //Widgets

    public static StartStudyFragment newInstance() {

        Bundle args = new Bundle();

        StartStudyFragment fragment = new StartStudyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.start_study_fragment, container, false);

        wireWidgets(v);
        setClickListeners(v);

        return v;
    }

    private void setClickListeners(View v) {



    }

    private void wireWidgets(View v) {

    }

}
