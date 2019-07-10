package com.example.c.sasirangan;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
private static Button button;
    Button btnBelajar, btnBermain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnClickListener();
    }
public void OnClickListener(){
    button = (Button) findViewById(R.id.btnBelajar);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent belajar = new Intent(MainActivity.this, belajar.class);
            startActivity(belajar);
        }
    });

    button = (Button) findViewById(R.id.btnBermain);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent main = new Intent(MainActivity.this, game.class);
            startActivity(main);
        }
    });

    button = findViewById(R.id.btnAbout);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent about = new Intent(MainActivity.this, about.class);
            startActivity(about);
        }
    });



}

}

