package com.example.ods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ODS9Activity extends AppCompatActivity {

    Button btnVoltar9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods9);

        btnVoltar9 = findViewById(R.id.btnVoltar9);

    }
}