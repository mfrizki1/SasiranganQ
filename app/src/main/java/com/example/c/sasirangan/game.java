package com.example.c.sasirangan;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class game extends AppCompatActivity {
    //Buat Variabel
    TextView mtvSkor, mtvSoal,mtxtSkor;
    ImageView mivGambar;
    RadioGroup mrgPilihanJawaban;
    RadioButton mrbPilihanJawaban1, mrbPilihanJawaban2, mrbPilihanJawaban3;
    Button mbtnSubmit;

    int skor = 0;
    int arr;
    int x;
    String jawaban;
    MediaPlayer audioBackground;


    //Manggil objek dari class SoalPilihanGanda
    SoalPilihanGanda soalPG = new SoalPilihanGanda();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mtvSkor = (TextView) findViewById(R.id.tvSkor);
        mtvSoal = (TextView) findViewById(R.id.tvSoal);
        mtxtSkor = (TextView)findViewById(R.id.txtskor);
        mivGambar = (ImageView) findViewById(R.id.ivGambar);
        mrgPilihanJawaban = (RadioGroup) findViewById(R.id.rgPilihanJawaban);
        mrbPilihanJawaban1 = (RadioButton) findViewById(R.id.rbPilihanJawaban1);
        mrbPilihanJawaban2 = (RadioButton) findViewById(R.id.rbPilihanJawaban2);
        mrbPilihanJawaban3 = (RadioButton) findViewById(R.id.rbPilihanJawaban3);
        mbtnSubmit = (Button) findViewById(R.id.btnSubmit);

        audioBackground = MediaPlayer.create(this, R.raw.lagu);
        audioBackground.setLooping(true);
        audioBackground.start();

        Typeface font1=Typeface.createFromAsset(getAssets(),"font/Wonderingserif-Regular.ttf");
        mtvSoal.setTypeface(font1);

        Typeface font2=Typeface.createFromAsset(getAssets(),"font/AgenzadaDemo-Italic.otf");
        mtxtSkor.setTypeface(font2);
        mtvSkor.setTypeface(font2);

        //set konten
        mtvSkor.setText(""+skor);
        setKonten();

        //aksi ketiki button submit di klik
        mbtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawaban();
            }
        });
    }

    //method setKonten
    public void setKonten() {
        mrgPilihanJawaban.clearCheck();
        arr = soalPG.pertanyaan.length;
        if(x >= arr) {
            String jumlahSkor = String.valueOf(skor);
            Intent i = new Intent(game.this, skor.class);
            i.putExtra("skorAkhir", jumlahSkor);
            i.putExtra("activity","PilihanGanda");
            startActivity(i);
            audioBackground.setVolume(1,1);
            audioBackground.stop();

        }else{
            mtvSoal.setText(soalPG.getPertanyaan(x));
            mrbPilihanJawaban1.setText(soalPG.getPilihanJawaban1(x));
            mrbPilihanJawaban2.setText(soalPG.getPilihanJawaban2(x));
            mrbPilihanJawaban3.setText(soalPG.getPilihanJawaban3(x));
            ubahGambar();
            jawaban = soalPG.getJawabanBenar(x);
        }
        x++;
    }

    public void ubahGambar(){
        Resources res = getResources();
        String mPhoto = soalPG.getStringGambar(x);
        int resID = res.getIdentifier(mPhoto, "drawable", getPackageName());
        Drawable drawable = res.getDrawable(resID);
        mivGambar.setImageDrawable(drawable);
    }

    public void cekJawaban() {
        if(mrbPilihanJawaban1.isChecked()) {
            if(mrbPilihanJawaban1.getText().toString().equals(jawaban)) {
                skor = skor + 10;
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            }else{
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(mrbPilihanJawaban2.isChecked()) {
            if(mrbPilihanJawaban2.getText().toString().equals(jawaban)) {
                skor = skor + 10;
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            }else{
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(mrbPilihanJawaban3.isChecked()) {
            if(mrbPilihanJawaban3.getText().toString().equals(jawaban)) {
                skor = skor + 10;
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            }else{
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else{
            Toast.makeText(this, "Silahkan Pilih Jawaban dulu!", Toast.LENGTH_SHORT).show();
        }
    }

    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan kuis", Toast.LENGTH_SHORT).show();
    }
}
