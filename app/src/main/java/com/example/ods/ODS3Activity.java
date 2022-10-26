package com.example.ods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ODS3Activity extends AppCompatActivity {

    Button btnVoltar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods3);

        btnVoltar3 = findViewById(R.id.btnVoltar3);

    }
}