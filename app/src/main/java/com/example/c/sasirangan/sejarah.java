package com.example.c.sasirangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sejarah extends AppCompatActivity {
    Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);

    home = (Button)findViewById(R.id.btnHome);
    home.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent home = new Intent( sejarah.this, belajar.class);
            startActivity(home);
        }
    });
    }
}
