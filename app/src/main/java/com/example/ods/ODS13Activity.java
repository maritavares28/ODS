package com.example.ods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ODS13Activity extends AppCompatActivity {

    Button btnVoltar13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods13);

        btnVoltar13 = findViewById(R.id.btnVoltar13);

    }
}