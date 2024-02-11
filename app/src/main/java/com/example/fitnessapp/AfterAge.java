package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AfterAge extends AppCompatActivity {

    LinearLayout e1,e2,e3,e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_age);

        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),E5.class);
                startActivity(intent);
            }
        });

        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),E6.class);
                startActivity(intent);
            }
        });

        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),E7.class);
                startActivity(intent);
            }
        });

        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),E8.class);
                startActivity(intent);
            }
        });

    }
}