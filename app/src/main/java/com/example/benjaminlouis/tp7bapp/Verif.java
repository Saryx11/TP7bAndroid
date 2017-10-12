package com.example.benjaminlouis.tp7bapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Verif extends AppCompatActivity {
    private static int score=0;
    private int indexQuestions=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verif);


        //On vérifie les Intent pour initialiser les paramètres de la classe
        Intent intent = getIntent();
        boolean correct = intent.getBooleanExtra("correct",false);
        indexQuestions=intent.getIntExtra("index",0);
        //Si l'index est égal à 0 (première question) le score est remis à 0
        if(indexQuestions==0)
            score=0;
        // On affiche le résultat de la question et augmente le score si la réponse est correcte
        TextView editText = (TextView) findViewById(R.id.texteVerif);
        if(correct) {
            editText.setText("réponse correcte");
            score+=1;
        }
        else {
            editText.setText("réponse non correcte");
        }

        // Ajout du listener sur le bouton et modification de la cible en fonction du nombre
        // de questions déjà répondues
        Button suivant = (Button) findViewById(R.id.boutonSuite);
        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("BOUTON","suivant");
                if(indexQuestions<9){
                    indexQuestions+=1;
                    Intent intent = new Intent(Verif.this,AffichageQuestion.class);
                    intent.putExtra("index", indexQuestions);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(Verif.this,Bilan.class);
                    intent.putExtra("score",score);
                    startActivity(intent);
                }

            }
        });

    }
}
