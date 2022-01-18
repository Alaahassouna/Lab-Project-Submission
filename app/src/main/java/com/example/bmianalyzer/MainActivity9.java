package com.example.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity9 extends AppCompatActivity {
    TextView newAccount;
    TextView text4;
    TextView name;
    TextView email;
    TextView password;
    TextView password2;
    Button creat1;
    TextView text55;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        creat1 = findViewById(R.id.creat1);
        text4= findViewById(R.id.text4);
        name = findViewById(R.id.name);
        password= findViewById(R.id.password);
        password2= findViewById(R.id.password2);
        button3= findViewById(R.id.button3);
        email = findViewById(R.id.email);
        newAccount= findViewById(R.id.newAccount);
        text55= findViewById(R.id.text55);

    }


    public void  Button3 (View v){
        Intent intent = new Intent (this,MainActivity8.class);
        startActivity(intent);
}}