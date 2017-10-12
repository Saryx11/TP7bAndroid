package com.example.benjaminlouis.tp7bapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bilan extends AppCompatActivity {
    int score=0;
    int numberOfQuestions=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilan);

        //On vérifie les intent et met à jour le score
        Intent intent = getIntent();
        score = intent.getIntExtra("score",0);
        numberOfQuestions = intent.getIntExtra("nombre",0);


        // On affiche le score final
        TextView finalText = (TextView) findViewById(R.id.texteBilan);
        finalText.setText(String.format(getResources().getString(R.string.bilan),score,numberOfQuestions));

        //On ajoute le listener sur le bouton pour recommencer le quizz et réinitialiser l'index
        Button endButton = (Button) findViewById(R.id.boutonFin);
        endButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("BOUTON","Bouton Fin");
                Intent intent = new Intent(Bilan.this,QuestionsActivity.class);
                intent.putExtra("index", 0);
                startActivity(intent);
            }
        });

    }
}
