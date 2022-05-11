package com.muzafferatmaca.szlkuygulamas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView textViewIngilizce,textViewTurkce;
    Kelimeler kelime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textViewIngilizce = findViewById(R.id.textViewIngilizce);
        textViewTurkce = findViewById(R.id.textViewTurkce);

        kelime = (Kelimeler) getIntent().getSerializableExtra("nesne");

        textViewIngilizce.setText(kelime.getIngilizce());
        textViewTurkce.setText(kelime.getTurkce());


    }
}