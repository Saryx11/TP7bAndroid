package com.example.benjaminlouis.tp7bapp;

/**
 * Created by benjaminlouis on 11/10/2017.
 */

public class Answer {
    private String text;
    private boolean correct;
    public Answer(String text, boolean correct){
        this.text = text;
        this.correct =correct;
    }
    public String getText(){
        return this.text;
    }
    public void setText(String text){
        this.text = text;
    }
    public boolean isCorrect(){
        return this.correct;
    }
}
