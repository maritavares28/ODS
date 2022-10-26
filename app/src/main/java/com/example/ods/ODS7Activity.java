package com.example.ods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ODS7Activity extends AppCompatActivity {

    Button btnVoltar7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods7);

        btnVoltar7 = findViewById(R.id.btnVoltar7);

    }
}