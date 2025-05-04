package com.example.labesni.Activity;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.labesni.R;

public class WomenActivity extends AppCompatActivity {

    Button buttonAll, buttonMen, buttonKids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);  // Assure-toi que le fichier XML s'appelle bien comme ça

        buttonAll = findViewById(R.id.button1);   // All
        buttonMen = findViewById(R.id.button2);   // Men
        buttonKids = findViewById(R.id.button4);  // Kids

        // All -> MainActivity
        buttonAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WomenActivity.this, MainActivity.class));
            }
        });

        // Men -> MenActivity
        buttonMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WomenActivity.this, MenActivity.class));
            }
        });

        // Kids -> KidsActivity
        buttonKids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WomenActivity.this, KidsActivity.class));
            }
        });
    }
}

