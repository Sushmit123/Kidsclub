package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FQ3evs extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fq3evs);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        nextbtn = findViewById(R.id.nextbtn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FQ3evs.this, "wrong" , Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    button1.setBackgroundColor(Color.RED);
                }
                else {
                    if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                        button1.setBackgroundColor(Color.YELLOW);
                    }
                }
                return false;
            }
        });






        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FQ3evs.this, "Wrong" , Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    button2.setBackgroundColor(Color.RED);
                }
                else {
                    if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                        button2.setBackgroundColor(Color.YELLOW);
                    }
                }
                return false;
            }
        });






        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FQ3evs.this, "Right" , Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    button3.setBackgroundColor(Color.GREEN);
                }
                else {
                    if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                        button3.setBackgroundColor(Color.YELLOW);
                    }
                }
                return false;
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FQ3evs.this, "Wrong" , Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    button4.setBackgroundColor(Color.RED);
                }
                else {
                    if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                        button4.setBackgroundColor(Color.YELLOW);
                    }
                }
                return false;
            }
        });


        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FQ4evs();
            }
        });


    }
    public void  FQ4evs() {
        Intent intent = new Intent(this,  FQ4evs.class);
        startActivity(intent);
    }
    }
