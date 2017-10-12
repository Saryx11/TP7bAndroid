package com.example.benjaminlouis.tp7bapp;

/**
 * Created by benjaminlouis on 11/10/2017.
 */

public class Question {
    private String texte;
    private Reponse rep1;
    private Reponse rep2;
    public Question(String texte, Reponse rep1, Reponse rep2){
        this.texte=texte;
        this.rep1=rep1;
        this.rep2=rep2;
    }
    public String getTexte(){
        return this.texte;
    }
    public Reponse getReponse1(){
        return this.rep1;
    }
    public Reponse getReponse2(){
        return this.rep2;
    }
}
