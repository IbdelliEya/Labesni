package com.example.labesni.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.labesni.R;

public class KidsActivity extends AppCompatActivity {

    Button buttonAll, buttonMen, buttonWomen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids);  // Assure-toi que ce nom correspond bien à ton layout

        buttonAll = findViewById(R.id.button1);   // All
        buttonMen = findViewById(R.id.button2);   // Men
        buttonWomen = findViewById(R.id.button3); // Women

        // All -> MainActivity
        buttonAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KidsActivity.this, MainActivity.class));
            }
        });

        // Men -> MenActivity
        buttonMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KidsActivity.this, MenActivity.class));
            }
        });

        // Women -> WomenActivity
        buttonWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KidsActivity.this, WomenActivity.class));
            }
        });
    }
}

