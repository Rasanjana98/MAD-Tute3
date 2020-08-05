package com.rasanjana.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();


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
                finish();

                Context context=getApplicationContext();
                CharSequence message = "you just clicked OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast =Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP | Gravity.RIGHT, 0, 0);
                toast.show();
            }

        });

    }

}