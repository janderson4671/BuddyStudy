package com.example.buddystudy.Model;

import java.util.ArrayList;

class StudySet {

    //Private Variables
    private ArrayList<Question> mQuestions;
    private String studySetName;

    //Constructor
    public StudySet(ArrayList<Question> questions, String studySetName) {
        mQuestions = questions;
        this.studySetName = studySetName;
    }

    //Getters
    public ArrayList<Question> getQuestions() {
        return mQuestions;
    }

    public String getStudySetName() {
        return studySetName;
    }
}
