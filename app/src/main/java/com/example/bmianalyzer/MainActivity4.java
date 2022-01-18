package com.example.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView newRecord;
    TextView weight;
    TextView length;
    TextView date;
    TextView time;
    Button save2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        newRecord = findViewById(R.id.newrecord);
        date = findViewById(R.id.date);
        time = findViewById(R.id.time);
        weight= findViewById(R.id.weight);
        length= findViewById(R.id.length);
        save2= findViewById(R.id.save2);

    }
}