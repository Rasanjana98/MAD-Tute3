package com.rasanjana.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText txtNumber1;
    EditText txtNumber2;
    String string,string2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtNumber1=findViewById(R.id.editTextNumber3);
        txtNumber2=findViewById(R.id.editTextNumber4);

        string=getIntent().getExtras().getString("Value");
        txtNumber1.setText(string);
        string2=getIntent().getExtras().getString("Value2");
        txtNumber2.setText(string2);
    }
}