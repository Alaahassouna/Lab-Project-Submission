package com.example.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {
    TextView welcome;
    TextView text;
    TextView user;
    TextView password;
    Button log1;
    TextView text3;
    TextView button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        welcome = findViewById(R.id.welcome);
        text= findViewById(R.id.text);
        user = findViewById(R.id.user);
        password= findViewById(R.id.password);
        log1= findViewById(R.id.log1);
        text3 = findViewById(R.id.text3);
        button2= findViewById(R.id.button2);
    }

    public void  Button2 (View v){
        Intent intent = new Intent (this,MainActivity9.class);
        startActivity(intent);
    }
    public void  log1 (View v){
        Intent intent = new Intent (this,MainActivity2.class);
        startActivity(intent);
    }
}