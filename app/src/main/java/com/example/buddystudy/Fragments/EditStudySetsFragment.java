package com.example.buddystudy.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.buddystudy.R;

public class EditStudySetsFragment extends Fragment {

    //Widgets


    public static EditStudySetsFragment newInstance() {

        Bundle args = new Bundle();

        EditStudySetsFragment fragment = new EditStudySetsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.edit_study_sets_fragment, container, false);

        wireWidgets(v);
        setClickListeners(v);

        return v;
    }

    private void setClickListeners(View v) {

    }

    private void wireWidgets(View v) {

    }

}
