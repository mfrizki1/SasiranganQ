package com.example.c.sasirangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cara extends AppCompatActivity {
    Button trd;
    Button prt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara);

        trd = (Button)findViewById(R.id.btntradisional);
        trd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cara.this, Tradisional.class);
                startActivity(intent);
            }
        });
        prt = (Button)findViewById(R.id.btnprint);
        prt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prt = new Intent(cara.this, Print.class);
                startActivity(prt);
            }
        });

    }
}
