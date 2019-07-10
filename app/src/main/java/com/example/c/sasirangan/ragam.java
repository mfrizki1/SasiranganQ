package com.example.c.sasirangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ragam extends AppCompatActivity {
    private static CardView cv;
    private static Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ragam);

        OnClickListener();
    }

    public void OnClickListener(){
        cv = (CardView) findViewById(R.id.rajabayam);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, RajaBayam.class);
                startActivity(intent);
            }
        });

        cv = (CardView)findViewById(R.id.bintangbahambur);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, BintangBahambur.class);
                startActivity(intent);
            }
        });

        cv = (CardView)findViewById(R.id.daunjaruju);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, DaunJaruju.class);
                startActivity(intent);
            }
        });

        cv = (CardView)findViewById(R.id.kulatkarikit);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, KulatKarikit.class);
                startActivity(intent);
            }
        });

        cv = (CardView)findViewById(R.id.gelombang);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, Gelombang.class);
                startActivity(intent);
            }
        });

        cv = (CardView)findViewById(R.id.gigiharuan);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, GigiHaruan.class);
                startActivity(intent);
            }
        });

        cv = (CardView)findViewById(R.id.tampukmanggis);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, KambangTampukManggis.class);
                startActivity(intent);
            }
        });

        cv = (CardView)findViewById(R.id.nagabalimbur);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, NagaBalimbur.class);
                startActivity(intent);
            }
        });

        cv = (CardView)findViewById(R.id.kangkung);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, KangkungKaumbakan.class);
                startActivity(intent);
            }
        });

        cv = (CardView)findViewById(R.id.kambangsasaki);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, KambangSasaki.class);
                startActivity(intent);
            }
        });

        cv = (CardView)findViewById(R.id.kembangkacang);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, KembangKacang.class);
                startActivity(intent);
            }
        });

        cv = (CardView)findViewById(R.id.ombaksinapur);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, OmbakSinapurKarang.class);
                startActivity(intent);
            }
        });

        cv = (CardView)findViewById(R.id.ramaksahang);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, RamakSahang.class);
                startActivity(intent);
            }
        });

        cv = (CardView)findViewById(R.id.ularlidi);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ragam.this, UlarLidi.class);
                startActivity(intent);
            }
        });

        cv = (CardView)findViewById(R.id.turundayang);
        cv.setOnClickListener(new View.OnClickListener() {
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
