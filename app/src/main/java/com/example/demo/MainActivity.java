package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //aa
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "Toast Message for clicking Login button" , Toast.LENGTH_SHORT ).show();
            }
        });

        TextView tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Toast Message for clicking Register Here", Toast.LENGTH_SHORT).show();
            }
        });
    }
}


