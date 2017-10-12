package com.example.benjaminlouis.tp7bapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionsActivity extends AppCompatActivity {

    //initialisation du tableau de questions
    private static Question[] questions= new Question[]{
            //une question possède un texte et deux réponses
            //Une réponse possède un texte et un booléen indiquant si elle est correcte
            new Question("Est-ce une appli Android ?", new Answer("oui", true), new Answer("non", false)),
            new Question("Est-ce compatible iPhone ?",new Answer("oui", false), new Answer("non", true)),
            new Question("Par qui est-ce développé ?",new Answer("Benjamin", true), new Answer("Thomas", false)),
            new Question("Où fut créée cette application ?",new Answer("Paris", false), new Answer("Nantes", true)),
            new Question("Cette application est-elle géniale ?",new Answer("oui", true), new Answer("carrément", true)),
            new Question("Voulez vous faire une pause ?",new Answer("oui", false), new Answer("non", true)),
            new Question("Le matériel Mac est... ",new Answer("intuitif", false), new Answer("cher", true)),
            new Question("Ce QCM peut-il se faire sur tablette ?",new Answer("oui", true), new Answer("non", false)),
            new Question("Faire 10 questions en dur est-il agréable ?",new Answer("oui", false), new Answer("non", true)),
            new Question("Ce QCM est-il sympathique ?",new Answer("oui", true), new Answer("non", false)),
    };
    //initialisation de l'index
    private static int index=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage_question);

        //verification des intent et mise à jour de l'index si besoin
        Intent intent = getIntent();
        index = intent.getIntExtra("index",index);

        //Affichage du texte de la question suivant l'index
        TextView texteQuestion = (TextView) findViewById(R.id.questionsText);
        texteQuestion.setText(questions[index].getText());

        //Affichage du texte de la première réponse
        Button bouton1 = (Button) findViewById(R.id.answer1);
        bouton1.setText(questions[index].getReponse1().getText());

        //Ajout du listener d'événement sur le bouton
        bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("BOUTON","Bouton 1");
                //Envoi du booleen de la réponse choisie et de l'index des questions à l'activité Verif
                Intent intent = new Intent(QuestionsActivity.this,Verif.class);
                intent.putExtra("correct", questions[index].getReponse1().isCorrect());
                intent.putExtra("index", index);
                startActivity(intent);
            }
        });

        //Même chose pour le bouton 2
        Button bouton2 = (Button) findViewById(R.id.answer2);
        bouton2.setText(questions[index].getReponse2().getText());
        bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("BOUTON","Bouton 2");
                Intent intent = new Intent(QuestionsActivity.this,Verif.class);
                intent.putExtra("correct", questions[index].getReponse2().isCorrect());
                intent.putExtra("index", index);
                startActivity(intent);
            }
        });
    }
}
