package com.example.labesni.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.labesni.R;

public class MenActivity extends AppCompatActivity {

    Button buttonAll, buttonWomen, buttonKids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men);  // Assure-toi que le nom du layout est correct

        buttonAll = findViewById(R.id.button1);     // bouton "All"
        buttonWomen = findViewById(R.id.button3);   // bouton "Women"
        buttonKids = findViewById(R.id.button4);    // bouton "Kids"

        // Revenir à la page principale
        buttonAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Aller vers WomenActivity
        buttonWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenActivity.this, WomenActivity.class);
                startActivity(intent);
            }
        });

        // Aller vers KidsActivity
        buttonKids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenActivity.this, KidsActivity.class);
                startActivity(intent);
            }
        });
    }
}









