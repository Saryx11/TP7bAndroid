package com.example.benjaminlouis.tp7bapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bilan extends AppCompatActivity {
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilan);

        //On vérifie les intent et met à jour le score
        Intent intent = getIntent();
        score = intent.getIntExtra("score",0);

        // On affiche le score final
        TextView texteBilan = (TextView) findViewById(R.id.texteBilan);
        texteBilan.setText("Score final : "+score+"/10");

        //On ajoute le listener sur le bouton pour recommencer le quizz et réinitialiser l'index
        Button boutonFin = (Button) findViewById(R.id.boutonFin);
        boutonFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("BOUTON","Bouton Fin");
                Intent intent = new Intent(Bilan.this,AffichageQuestion.class);
                intent.putExtra("index", 0);
                startActivity(intent);
                
            }
        });

    }
}
