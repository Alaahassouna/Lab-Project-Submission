package com.example.bmianalyzer;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {


    ImageView logo;
    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = findViewById(R.id.logo);
        btn_next= findViewById(R.id.button);

    }
    public void  btn_next (View v){
        Intent intent = new Intent (this,MainActivity8.class);
        startActivity(intent);


    }
}