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

    btn10 = findViewById(R.id.btn10);
    btn10.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent telaODS10 = new Intent(getApplicationContext(),ODS10Activity.class);
            startActivity(telaODS10);
        }
    });
//ODS10
        btn10 = findViewById(R.id.btn10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS10 = new Intent(getApplicationContext(),ODS10Activity.class);
                startActivity(telaODS10);
            }
        });
//ODS11
        btn11 = findViewById(R.id.btn11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS11 = new Intent(getApplicationContext(),ODS11Activity.class);
                startActivity(telaODS11);
            }
        });

        //ODS12
        btn12 = findViewById(R.id.btn12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS12 = new Intent(getApplicationContext(),ODS12Activity.class);
                startActivity(telaODS12);
            }
        });

        //ODS13
        btn13 = findViewById(R.id.btn13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS13 = new Intent(getApplicationContext(),ODS13Activity.class);
                startActivity(telaODS13);
            }
        });
        btn14 = findViewById(R.id.btn14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS14= new Intent(getApplicationContext(),ODS14Activity.class);
                startActivity(telaODS14);
            }
        });
        btn15 = findViewById(R.id.btn15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS15 = new Intent(getApplicationContext(),ODS15Activity.class);
                startActivity(telaODS15);
            }
        });

        //ODS16
        btn16 = findViewById(R.id.btn16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS16 = new Intent(getApplicationContext(),ODS16Activity.class);
                startActivity(telaODS16);
            }
        });

        //ODS 17
        btn17 = findViewById(R.id.btn17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS17 = new Intent(getApplicationContext(),ODS17Activity.class);
                startActivity(telaODS17);
            }
        });




