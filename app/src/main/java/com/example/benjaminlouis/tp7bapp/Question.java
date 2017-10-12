package com.example.benjaminlouis.tp7bapp;

/**
 * Created by benjaminlouis on 11/10/2017.
 */

public class Question {
    private String text;
    private Answer answer1;
    private Answer answer2;
    public Question(String text, Answer answer1, Answer answer2){
        this.text = text;
        this.answer1 = answer1;
        this.answer2 = answer2;
    }
    public String getText(){
        return this.text;
    }
    public Answer getReponse1(){
        return this.answer1;
    }
    public Answer getReponse2(){
        return this.answer2;
    }
}
