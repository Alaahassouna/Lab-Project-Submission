package com.example.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView current;
    TextView textView2;
    TextView old;
    Button addFood;
    Button addRecord;
    Button viewFood;
    TextView log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        current = findViewById(R.id.current);
        textView2= findViewById(R.id.textView2);
        old = findViewById(R.id.old);
        addFood= findViewById(R.id.addfood);
        addRecord= findViewById(R.id.addrecord);
        viewFood = findViewById(R.id.viewfood);
        log= findViewById(R.id.log);

    }
    public void  AddFood (View v) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void  addRecord (View v) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void  viewFood (View v) {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }

}