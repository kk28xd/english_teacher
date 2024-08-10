package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton colors;
    ImageButton family;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colors = findViewById(R.id.imageButton);
        family = findViewById(R.id.imageButton2);
        colors.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, colorsActivity.class);
            startActivity(intent);
        });
        family.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, family_Activity.class);
            startActivity(intent);
        });
    }
}