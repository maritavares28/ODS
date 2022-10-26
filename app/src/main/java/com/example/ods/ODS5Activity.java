package com.example.ods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ODS5Activity extends AppCompatActivity {

    Button btnVoltar5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods5);

        btnVoltar5 = findViewById(R.id.btnVoltar5);

    }
}