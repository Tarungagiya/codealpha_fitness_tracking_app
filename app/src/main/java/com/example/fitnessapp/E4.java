package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class E4 extends AppCompatActivity {

    TextView timer;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e4);

        timer = findViewById(R.id.timer);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CountDownTimer(60000,1000){

                    @Override
                    public void onTick(long l) {
                        timer.setText(""+ l/1000);
                    }

                    @Override
                    public void onFinish() {
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                    }
                }.start();
            }
        });

    }
}