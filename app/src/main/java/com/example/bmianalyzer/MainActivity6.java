package com.example.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    TextView edit;
    TextView name;
    TextView calory;
    TextView photo;
    ImageView imageView;
    Button uplode;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        edit = findViewById(R.id.edit);
        name= findViewById(R.id.name);
        calory = findViewById(R.id.calory);
        photo= findViewById(R.id.photo);
        imageView= findViewById(R.id.imageView);
        uplode = findViewById(R.id.uplode);
        save= findViewById(R.id.save);
    }
}