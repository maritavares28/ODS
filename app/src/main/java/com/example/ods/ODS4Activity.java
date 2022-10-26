package com.example.ods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ODS4Activity extends AppCompatActivity {

    Button btnVoltar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods4);

        btnVoltar4 = findViewById(R.id.btnVoltar4);

    }
}