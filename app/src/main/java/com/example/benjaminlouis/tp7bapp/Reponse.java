package com.example.benjaminlouis.tp7bapp;

/**
 * Created by benjaminlouis on 11/10/2017.
 */

public class Reponse {
    private String texte;
    private boolean correcte;
    public Reponse(String texte, boolean correcte){
        this.texte=texte;
        this.correcte=correcte;
    }
    public String getTexte(){
        return this.texte;
    }
    public void setTexte(String texte){
        this.texte=texte;
    }
    public boolean isCorrecte(){
        return this.correcte;
    }
}
