package com.rasanjana.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    EditText txtNumber1;
    EditText txtNumber2;
    String string,string2;
    TextView textView;
    Button btnAdd,btnSub,btnMulti,btnDevi;
    float result;
    int num1,num2;
    String operator;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtNumber1=findViewById(R.id.editTextNumber3);
        txtNumber2=findViewById(R.id.editTextNumber4);
        textView=findViewById(R.id.textAns);
        btnAdd=findViewById(R.id.buttonAdd);
        btnSub=findViewById(R.id.buttonSub);
        btnMulti=findViewById(R.id.buttonMulti);
        btnDevi=findViewById(R.id.buttonDev);

        string=getIntent().getExtras().getString("Value");
        txtNumber1.setText(string);
        string2=getIntent().getExtras().getString("Value2");
        txtNumber2.setText(string2);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(txtNumber1.getText().toString());
                num2=Integer.parseInt(txtNumber2.getText().toString());
                operator="+";
                result=num1+num2;
                textView.setText(txtNumber1.getText().toString()+ " " +operator+ " "+txtNumber2.getText().toString()+"=" +String.valueOf(result));
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(txtNumber1.getText().toString());
                num2=Integer.parseInt(txtNumber2.getText().toString());
                result=num1-num2;
                operator="-";
                textView.setText(txtNumber1.getText().toString()+ " "+operator+" "+txtNumber2.getText().toString()+"=" +String.valueOf(result));

            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(txtNumber1.getText().toString());
                num2=Integer.parseInt(txtNumber2.getText().toString());
                result=num1*num2;
                operator="*";
                textView.setText(txtNumber1.getText().toString()+ " "+operator+" "+txtNumber2.getText().toString()+"=" +String.valueOf(result));

            }
        });
        btnDevi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(txtNumber1.getText().toString());
                num2=Integer.parseInt(txtNumber2.getText().toString());
                result=num1/num2;
                operator="/";
                textView.setText(txtNumber1.getText().toString()+ " "+operator+" "+txtNumber2.getText().toString()+"=" +String.valueOf(result));

            }
        });

    }
}