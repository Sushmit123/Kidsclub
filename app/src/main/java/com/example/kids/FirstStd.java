package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class FirstStd extends AppCompatActivity {
    private String selectedTopicName = "";
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_std);

        button1 =(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fmaths();

            }
        });

        button2 =(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fevs();

            }
        });
        button3 =(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ffood();

            }
        });


        final LinearLayout alphabet = findViewById(R.id.alphabet);
        final LinearLayout evs = findViewById(R.id.evs);
        final  LinearLayout Body = findViewById(R.id.Body);
//        final LinearLayout comingsoon = findViewById(R.id.Comingsoon);

        alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName= "alphabet";
                alphabet.setBackgroundResource(R.drawable.round_back_white_stroke10);

                evs.setBackgroundResource(R.drawable.round_back_white10);
                Body.setBackgroundResource(R.drawable.round_back_white10);
//                comingsoon.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        evs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName= "evs";
                evs.setBackgroundResource(R.drawable.round_back_white_stroke10);


                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                Body.setBackgroundResource(R.drawable.round_back_white10);
//                comingsoon.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        Body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "body";

                Body.setBackgroundResource(R.drawable.round_back_white_stroke10);

                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                evs.setBackgroundResource(R.drawable.round_back_white10);
//                comingsoon.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
//        comingsoon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                selectedTopicName = "Comingsoon";
//
//                comingsoon.setBackgroundResource(R.drawable.round_back_white_stroke10);
//
//                alphabet.setBackgroundResource(R.drawable.round_back_white10);
//                evs.setBackgroundResource(R.drawable.round_back_white10);
//                Body.setBackgroundResource(R.drawable.round_back_white10);
//
//
//            }
//        });

    }
    public void  Fmaths() {
        Intent intent = new Intent(this,  FMaths.class);
        startActivity(intent);
    }

    public void  Fevs() {
        Intent intent = new Intent(this,  Fevs.class);
        startActivity(intent);
    }
    public void  Ffood() {
        Intent intent = new Intent(this,  Ffood.class);
        startActivity(intent);
    }


}