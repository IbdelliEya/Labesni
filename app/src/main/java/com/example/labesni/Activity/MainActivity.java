package com.example.labesni.Activity;

import static com.example.labesni.R.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;

import com.example.labesni.Adapter.CategoryAdapter;
import com.example.labesni.Adapter.PopularAdapter;
import com.example.labesni.Adapter.SliderAdapter;
import com.example.labesni.Domain.BannerModel;
import com.example.labesni.R;
import com.example.labesni.ViewModel.MainViewModel;
import com.example.labesni.databinding.ActivityMainBinding;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button buttonMen, buttonWomen, buttonKids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);  // Assure-toi que le nom du layout est correct

        buttonMen = findViewById(id.button2);     // bouton "Men"
        buttonWomen = findViewById(id.button3);   // bouton "Women"
        buttonKids = findViewById(id.button4);    // bouton "Kids"

        // Bouton Men
        buttonMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenActivity.class);
                startActivity(intent);
            }
        });

        // Bouton Women
        buttonWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WomenActivity.class);
                startActivity(intent);
            }
        });

        // Bouton Kids
        buttonKids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KidsActivity.class);
                startActivity(intent);
            }
        });
    }
}