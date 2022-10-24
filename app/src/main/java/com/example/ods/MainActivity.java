package com.example.ods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // declarar os botoes
    Button btn1,btn2,btn3,btn4,btn5,bt6,btn7,btn8,btn9,btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ODS1
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS1 = new Intent( getApplicationContext() , ODS1Activity.class);
                startActivity(telaODS1);
            }
        });
        //ODS2
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS2 = new Intent( getApplicationContext(), ODS2Activity.class);
                startActivity(telaODS2);
            }
        });
        //ODS3
        btn3 = findViewById(R.id.btn3);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS3 = new Intent(getApplicationContext(),ODS3Activity.class);
                startActivity(telaODS3);

            }
        });
        //ODS4
        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS4 = onNewIntent(getApplicationContext(),ODS4Activity.class);
                startActivity(telaODS4);
            }

        });
        //ODS5
        btn5 = findViewById(R.id.btn5);
        


    }
}