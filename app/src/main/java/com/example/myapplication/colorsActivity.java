package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class colorsActivity extends AppCompatActivity {

    Button white;
    Button black;
    Button blue;
    Button red;
    Button green;
    MediaPlayer white_sound;
    MediaPlayer black_sound;
    MediaPlayer blue_sound;

    MediaPlayer red_sound;
    MediaPlayer green_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        white = findViewById(R.id.button5);
        black = findViewById(R.id.button);
        blue = findViewById(R.id.button2);
        red = findViewById(R.id.button3);
        green = findViewById(R.id.button4);
        white_sound = MediaPlayer.create(this, R.raw.white);
        this.white.setOnClickListener(v -> {
            white_sound.start();
        });
        black_sound = MediaPlayer.create(this, R.raw.black);
        this.black.setOnClickListener(v -> {
            black_sound.start();
        });
        blue_sound = MediaPlayer.create(this, R.raw.blue);
        this.blue.setOnClickListener(v -> {
            blue_sound.start();
        });
        red_sound = MediaPlayer.create(this, R.raw.red);
        this.red.setOnClickListener(v -> {
            red_sound.start();
        });
        green_sound = MediaPlayer.create(this, R.raw.green);
        this.green.setOnClickListener(v -> {
            green_sound.start();
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        white_sound.release();
        red_sound.release();
        black_sound.release();
        green_sound.release();
        black_sound.release();
    }
}