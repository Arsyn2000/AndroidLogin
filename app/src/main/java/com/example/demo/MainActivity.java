package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    EditText username, password;
    Button btn1;
    Background bg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.activity_main_loginButton);
        username = findViewById(R.id.activity_main_usernameEditText);
        password = findViewById(R.id.activity_main_passwordEditText);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                openNewActivity();
            }
        });

        TextView tv2 = findViewById(R.id.textView2);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Toast Message for clicking Register Here", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void openNewActivity(){
        String user = username.getText().toString();
        String pass = password.getText().toString();
        bg = new Background(getApplicationContext());
        bg.execute(user, pass);
        Intent intent;
        if(user.equals("admin") && pass.equals("admin")){
            intent = new Intent(this, SecondActivity.class);
        }else{
            Toast.makeText(getBaseContext(), "Wrong credentials. Try again.", Toast.LENGTH_SHORT).show();
            intent = new Intent(this, MainActivity.class);
        }
        startActivity(intent);

    }
}


