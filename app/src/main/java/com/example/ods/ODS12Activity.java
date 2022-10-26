package com.example.ods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ODS12Activity extends AppCompatActivity {

    Button btnVoltar12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods12);

        btnVoltar12 = findViewById(R.id.btnVoltar12);

    }
}