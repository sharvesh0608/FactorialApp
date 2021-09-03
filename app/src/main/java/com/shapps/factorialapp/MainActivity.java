package com.shapps.factorialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        Button b1;
        EditText v;
        TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.button);
        v=(EditText)  findViewById(R.id.editTextNumber);
        result=(TextView) findViewById(R.id.textView3);

        b1.setOnClickListener(v1 -> {
            int num= Integer.parseInt(v.getText().toString());
            double fact=1;
            for(int i=1;i<=num;i++){
                fact=fact*i;
            }
            result.setText(Double.toString(fact));
        });
    }
}