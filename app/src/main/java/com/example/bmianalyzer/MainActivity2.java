package com.example.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView complete;
    TextView date;
    TextView gender;
    TextView weight;
    TextView length;
    TextView kg;
    TextView cm ;
    RadioButton radio;
    Button btn_save ;
    TextView weight1;
    TextView length1;
    TextView date1;
    RadioGroup group;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        complete= findViewById(R.id.complete);
        date= findViewById(R.id.date);
        gender= findViewById(R.id.gender);
        weight= findViewById(R.id.weight);
        length= findViewById(R.id.length);
        kg= findViewById(R.id.kg);
        cm= findViewById(R.id.cm);
        group = findViewById(R.id.group);
        btn_save = findViewById(R.id.save2);
        weight1 = findViewById(R.id.weight1);
        length1 = findViewById(R.id.length1);
        date1 = findViewById(R.id.date1);
        radio = findViewById(R.id.radio);



    }
    public void  btn_save (View v){
        Intent intent = new Intent (this,MainActivity3.class);
        startActivity(intent);

}
}