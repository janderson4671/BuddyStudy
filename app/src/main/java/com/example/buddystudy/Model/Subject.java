package com.example.buddystudy.Model;

import java.util.ArrayList;

class Subject {

    //Private Variables
    private ArrayList<StudySet> mStudySets;
    private String subjectName;

    //Constructor
    public Subject(ArrayList<StudySet> studySets, String subjectName) {
        mStudySets = studySets;
        this.subjectName = subjectName;
    }

    //Getters and Setters
    public ArrayList<StudySet> getStudySets() {
        return mStudySets;
    }

    public String getSubjectName() {
        return subjectName;
    }
}
