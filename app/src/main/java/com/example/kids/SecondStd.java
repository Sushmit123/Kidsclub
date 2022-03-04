package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SecondStd extends AppCompatActivity {

    private String selectedTopicName = "";
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_std);

        button1 =(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Smaths();

            }
        });
        button2 =(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sclock();
            }
        });
        button3 =(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Smarathi();
            }
        });

        final LinearLayout alphabet = findViewById(R.id.alphabet);
        final LinearLayout number = findViewById(R.id.number);
        final  LinearLayout Body = findViewById(R.id.Body);

        alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName= "alphabet";
                alphabet.setBackgroundResource(R.drawable.round_back_white_stroke10);

                number.setBackgroundResource(R.drawable.round_back_white10);
                Body.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "number";

                number.setBackgroundResource(R.drawable.round_back_white_stroke10);

                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                Body.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        Body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Body";

                Body.setBackgroundResource(R.drawable.round_back_white_stroke10);

                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                number.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

    }
    public void  Smaths() {
        Intent intent = new Intent(this,  SMaths.class);
        startActivity(intent);
    }
    public void Sclock() {
        Intent intent = new Intent(this, Sclock.class);
        startActivity(intent);
    }
    public void Smarathi() {
        Intent intent = new Intent(this, Smarathi.class);
        startActivity(intent);
    }
    }
