package com.example.c.sasirangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class skor extends AppCompatActivity {
    TextView mtvHasilAkhir;
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        mtvHasilAkhir = (TextView)findViewById(R.id.tvSkorAkhir);
        home = (Button)findViewById(R.id.btnHome);

        setSkor();

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(skor.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void setSkor() {
        String activity = getIntent().getStringExtra("activity");
        String skorPilGan = getIntent().getStringExtra("skorAkhir");

        if(activity.equals("PilihanGanda")) {
            mtvHasilAkhir.setText("SKOR : "+skorPilGan);
        }
    }

    public void onBackPressed() {
        Toast.makeText(this, "Selesaikan kuis", Toast.LENGTH_SHORT).show();
    }
}
