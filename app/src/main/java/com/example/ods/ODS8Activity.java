package com.example.ods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ODS8Activity extends AppCompatActivity {

    Button btnVoltar8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods8);

        btnVoltar8 = findViewById(R.id.btnVoltar8);

    }
}