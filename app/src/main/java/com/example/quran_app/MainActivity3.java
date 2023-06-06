package com.example.quran_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent in = getIntent();
        String data = in.getStringExtra("Ayat");
        String SN = in.getStringExtra("SurahName");
        int AN = in.getIntExtra("AyatNo",-1);
        TextView TV = findViewById(R.id.b1);
        TextView TV1 = findViewById(R.id.a1);

        TV.setText(data);
        TV1.setText(SN +"آیت نمبر" + AN ) ;
    }
}