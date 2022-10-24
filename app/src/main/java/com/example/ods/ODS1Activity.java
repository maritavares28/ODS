import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods1);

        //botão sair

btnSair = findViewById(R.id.btnSair);
btnSair.setOnClickListener(new View.OnClickListener(){

    @Override
    public void onClicl(View view){
        finish();
        finishAffinity();
    }

}};


btn1 = findViewById(R.id.btn1);
btn1.setOnClickListenner(new View.OnClickListener(){
    @Override
    public void onClick(View view){
        intent ODS1 = new intent(getApplicationContext(),ODS1Activity.class);
        startActivity(ods1);
        }
        }};