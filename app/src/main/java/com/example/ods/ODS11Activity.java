package com.example.ods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ODS11Activity extends AppCompatActivity {

    Button btnVoltar11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods11);

        btnVoltar11 = findViewById(R.id.btnVoltar11);

    }
}