package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageButton;

public class family_Activity extends AppCompatActivity {

    MediaPlayer father_sound;
    MediaPlayer mother_sound;
    MediaPlayer grand_father_sound;
    MediaPlayer grand_mother_sound;

    ImageButton father;
    ImageButton mother;
    ImageButton grandFather;
    ImageButton grandMother;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        father = findViewById(R.id.father_btn);
        mother = findViewById(R.id.mother_btn);
        grandFather = findViewById(R.id.grandFather_btn);
        grandMother = findViewById(R.id.grandMother_btn);

        father_sound = MediaPlayer.create(this, R.raw.father);
        mother_sound = MediaPlayer.create(this, R.raw.mother);
        grand_father_sound = MediaPlayer.create(this, R.raw.grand_father);
        grand_mother_sound = MediaPlayer.create(this, R.raw.grand_mother);

        father.setOnClickListener(v -> {
            father_sound.start();
        });

        mother.setOnClickListener(v -> {
            mother_sound.start();
        });

        grandMother.setOnClickListener(v -> {
            grand_mother_sound.start();
        });

        grandFather.setOnClickListener(v -> {
            grand_father_sound.start();
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        father_sound.release();
        mother_sound.release();
        grand_father_sound.release();
        grand_mother_sound.release();
    }
}