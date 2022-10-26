package com.example.ods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // declarar os botoes
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;

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
                Intent telaODS4 = new Intent(getApplicationContext(), ODS4Activity.class);
                startActivity(telaODS4);
            }

        });
        //ODS5
        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS5 = new Intent(getApplicationContext(), ODS5Activity.class);
                startActivity(telaODS5);
            }

        });
        //ODS6
        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS6 = new Intent(getApplicationContext(),ODS6Activity.class);
                startActivity(telaODS6);
            }
        });

        //ODS7
    btn7 = findViewById(R.id.btn7);
    btn7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent telaODS7 = new Intent(getApplicationContext(),ODS7Activity.class);
            startActivity(telaODS7);
        }
    });

    btn8 = findViewById(R.id.btn8);
    btn8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent telaODS8 = new Intent(getApplicationContext(),ODS8Activity.class);
            startActivity(telaODS8);
        }
    });


    btn9 = findViewById(R.id.btn9);
    btn9.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
                Intent telaODS9= new Intent(getApplicationContext(),ODS9Activity.class);
                startActivity(telaODS9);
         }
    });


