package com.example.ods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ODS2Activity extends AppCompatActivity {

    Button btnVoltar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods2);

        btnVoltar2 = findViewById(R.id.btnVoltar2);

    }
}