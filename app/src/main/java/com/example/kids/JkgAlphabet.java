package com.example.kids;
//
//import static com.example.kids.JkgAlphabetQ.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JkgAlphabet extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button nextbtn;

//    CountDownTimer countDownTimer;
//    int timervalue = 20;
//    ProgressBar progressBar;
//    List<JkgAlphabetModelclass> allQuetionsList;
//    JkgAlphabetModelclass modelclass;
//    int index=0;
//    TextView card_question, optiona, optionb,optionc,optiond;
//    CardView cardOA, cardOB, cardOC, cardoD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jkg_alphabet);

        //button

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        nextbtn = findViewById(R.id.nextbtn);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(JkgAlphabet.this, "Wrong" , Toast.LENGTH_SHORT).show();
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
                Toast.makeText(JkgAlphabet.this, "Right" , Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    button2.setBackgroundColor(Color.GREEN);
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
                Toast.makeText(JkgAlphabet.this, "Wrong" , Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    button3.setBackgroundColor(Color.RED);
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
                Toast.makeText(JkgAlphabet.this, "Wrong" , Toast.LENGTH_SHORT).show();
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
                JkgQ2Alphabet();
            }
        });








    }

    public void  JkgQ2Alphabet() {
        Intent intent = new Intent(this,  JkgQ2Alphabet.class);
        startActivity(intent);
    }
}
