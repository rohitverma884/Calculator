package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener{
    EditText et1;
    EditText et2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        Button button= findViewById(R.id.button);
        Button button1 =findViewById(R.id.button_sub);
        Button button2 = findViewById(R.id.button_intu);
        Button button3 = findViewById(R.id.button_div);
        et1=findViewById(R.id.fv1);
        et2=findViewById(R.id.sv2);
        result=findViewById(R.id.sum);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    /*    button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/


    }

    @Override
    public void onClick(View v) {
        double c=0;
        String a = "" + et1.getText();
        String b = "" + et2.getText();
        double v1 = Double.parseDouble(a);
        double v2 = Double.parseDouble(b);
        Calculation calculation = new Calculation();
        if (v.getId()==R.id.button) {
            c = calculation.sum(v1, v2);
        }
        if (v.getId()==R.id.button_sub){
            c= calculation.sub(v1,v2);

        }
        if(v.getId()==R.id.button_intu){
            c=calculation.multiply(v1,v2);

        }
        if (v.getId()==R.id.button_div){
            c= calculation.div(v1,v2);
        }
        result.setText(Double.toString(c));

    }
}