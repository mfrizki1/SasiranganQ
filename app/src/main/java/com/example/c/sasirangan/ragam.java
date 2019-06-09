package com.example.c.sasirangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ragam extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ragam);

        OnClickListener();
    }

    public void OnClickListener(){
        button = (Button)findViewById(R.id.sasi1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, RajaBayam.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.sasi2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, BintangBahambur.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.sasi3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, DaunJaruju.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.sasi10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, KulatKarikit.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.sasi4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, Gelombang.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.sasi5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, GigiHaruan.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.sasi6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, KambangTampukManggis.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.sasi11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, NagaBalimbur.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.sasi7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, KangkungKaumbakan.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.sasi8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, KambangSasaki.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.sasi9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, KembangKacang.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.sasi12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, OmbakSinapurKarang.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.sasi13);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, RamakSahang.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.sasi14);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, UlarLidi.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.sasi15);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, TurunDayang.class);
                startActivity(intent);
            }
        });

        button = (Button)findViewById(R.id.btnHome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, belajar.class);
                startActivity(intent);
            }
        });
    }
}
