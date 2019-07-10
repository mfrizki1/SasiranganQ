package com.example.c.sasirangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class belajar extends AppCompatActivity implements View.OnClickListener {

    CardView sejarah;
    CardView ragam;
    CardView alat;
    CardView cara;
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        sejarah = (CardView) findViewById(R.id.sejarah);
        sejarah.setOnClickListener(this);
        ragam = (CardView) findViewById(R.id.ragam);
        ragam.setOnClickListener(this);
        alat = (CardView) findViewById(R.id.alat);
        alat.setOnClickListener(this);
        cara = (CardView) findViewById(R.id.cara);
        cara.setOnClickListener(this);
        home = (Button)findViewById(R.id.btnHome);
        home.setOnClickListener(this);
    }
    @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.sejarah:
                    Intent sejarah = new Intent(belajar.this, sejarah.class);
                    startActivity(sejarah);
                    break;

                case R.id.ragam:
                    Intent ragam = new Intent(belajar.this, ragam.class);
                    startActivity(ragam);
                    break;

                case R.id.alat:
                    Intent alat = new Intent(belajar.this, alat.class);
                    startActivity(alat);
                    break;

                case R.id.cara:
                    Intent cara = new Intent(belajar.this, cara.class);
                    startActivity(cara);
                    break;

                case R.id.btnHome:
                    Intent home = new Intent(belajar.this, MainActivity.class);
                    startActivity(home);
                    break;
            }
    }
}
