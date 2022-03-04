package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SerniorKg extends AppCompatActivity {

    private String selectedTopicName = "";
    private Button button1;
    private Button button2;
    private Button button3;
    private  Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sernior_kg);

        button1 =(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SKgEnglish();
            }
        });

        button2 =(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SkgMaths();

            }
        });

        button3 =(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             SkgBpart();

            }
        });
//        button4 =(Button) findViewById(R.id.button4);
//        button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                JkgAlphabet();
//            }
//        });


        final LinearLayout alphabet = findViewById(R.id.alphabet);
        final LinearLayout number = findViewById(R.id.number);
        final  LinearLayout Body = findViewById(R.id.Body);
//        final LinearLayout wateranimal = findViewById(R.id.water);

//        final Button startBtn = findViewById(R.id.startQuizBtn);

        alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName= "alphabet";
                alphabet.setBackgroundResource(R.drawable.round_back_white_stroke10);

                number.setBackgroundResource(R.drawable.round_back_white10);
                Body.setBackgroundResource(R.drawable.round_back_white10);
//                wateranimal.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "number";

                number.setBackgroundResource(R.drawable.round_back_white_stroke10);

                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                Body.setBackgroundResource(R.drawable.round_back_white10);
//                wateranimal.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        Body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Body";

                Body.setBackgroundResource(R.drawable.round_back_white_stroke10);

                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                number.setBackgroundResource(R.drawable.round_back_white10);
//                wateranimal.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
//        wateranimal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                selectedTopicName = "wateranimal";
//
//                wateranimal.setBackgroundResource(R.drawable.round_back_white_stroke10);
//
//                alphabet.setBackgroundResource(R.drawable.round_back_white10);
//                number.setBackgroundResource(R.drawable.round_back_white10);
//                Body.setBackgroundResource(R.drawable.round_back_white10);
//            }
//        });

    }

    public void  SKgEnglish() {
        Intent intent = new Intent(this,  SKgEnglish.class);
        startActivity(intent);
    }

    public void SkgMaths() {
        Intent intent = new Intent(this, SkgMaths.class);
        startActivity(intent);
    }
    public void   SkgBpart(){
        Intent intent = new Intent(this,   SkgBpart.class);
        startActivity(intent);
    }
//    public void JkgAlphabet(){
//        Intent intent = new Intent(this, JkgAlphabet.class);
//        startActivity(intent);
//    }
}