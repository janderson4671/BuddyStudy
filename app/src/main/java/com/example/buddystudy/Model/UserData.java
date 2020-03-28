package com.example.buddystudy.Model;

import java.util.ArrayList;

public class UserData {

    //Private Variables
    private ArrayList<Subject> userClasses;
    private String userName;

    //Constructor
    public UserData(ArrayList<Subject> userClasses, String userName) {
        this.userClasses = userClasses;
        this.userName = userName;
    }

    //Getters and Setters
    public ArrayList<Subject> getUserClasses() {
        return userClasses;
    }

    public String getUserName() {
        return userName;
    }
}
