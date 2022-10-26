package com.example.ods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ODS6Activity extends AppCompatActivity {

    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods6);

        btnVoltar = findViewById(R.id.btnVoltar);

    }
}