package com.example.buddystudy.Model;

class Question {

    //Private Variables
    private String question;
    private String answer;

    //Constructor
    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    //Getters and Setters
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
