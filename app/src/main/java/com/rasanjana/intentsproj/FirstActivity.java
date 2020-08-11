package com.rasanjana.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button btn;
    EditText txtNumber1;
    EditText txtNumber2;
    String string,string2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.button);
        txtNumber1=findViewById(R.id.editTextNumber);
        txtNumber2=findViewById(R.id.editTextNumber2);

    }
    @Override
    protected void onResume() {
        super.onResume();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FirstActivity.this, SecondActivity.class);
                string= txtNumber1.getText().toString();
                string2=txtNumber2.getText().toString();
                intent.putExtra("Value",string);
                intent.putExtra("Value2",string2);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0,0);
                toast.show();

            }
        });
    }
}