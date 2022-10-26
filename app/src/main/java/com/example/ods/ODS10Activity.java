package com.example.ods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ODS10Activity extends AppCompatActivity {

    Button btnVoltar10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods10);

        btnVoltar10 = findViewById(R.id.btnVoltar10);

    }
}