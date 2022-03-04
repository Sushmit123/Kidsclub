package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    private String selectedTopicName = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // button code

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                juniorkg();
            }
        });


        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SerniorKg();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstStd();
            }
        });

        button4 = (Button) findViewById((R.id.button4));
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondStd();

            }
        });

        //button code finish


//white boarder code

        final LinearLayout Juniorkg = findViewById(R.id.JuniorKg);
        final LinearLayout SeniorKg = findViewById(R.id.SeniorKg);
        final LinearLayout FirstStandard = findViewById(R.id.FirstStandard);
        final LinearLayout SecondStandard = findViewById(R.id.SecondStandard);


        Juniorkg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "JuniorKg";
                Juniorkg.setBackgroundResource(R.drawable.round_back_white_stroke10);

                SeniorKg.setBackgroundResource(R.drawable.round_back_white10);
                FirstStandard.setBackgroundResource(R.drawable.round_back_white10);
                SecondStandard.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        SeniorKg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "SeniorKg";

                SeniorKg.setBackgroundResource(R.drawable.round_back_white_stroke10);

                Juniorkg.setBackgroundResource(R.drawable.round_back_white10);
                FirstStandard.setBackgroundResource(R.drawable.round_back_white10);
                SecondStandard.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        FirstStandard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "FirstStandard";

                FirstStandard.setBackgroundResource(R.drawable.round_back_white_stroke10);

                Juniorkg.setBackgroundResource(R.drawable.round_back_white10);
                SeniorKg.setBackgroundResource(R.drawable.round_back_white10);
                SecondStandard.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        SecondStandard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "SecondStandard";

                SecondStandard.setBackgroundResource(R.drawable.round_back_white_stroke10);

                Juniorkg.setBackgroundResource(R.drawable.round_back_white10);
                SeniorKg.setBackgroundResource(R.drawable.round_back_white10);
                FirstStandard.setBackgroundResource(R.drawable.round_back_white10);


            }
        });
//wihte boarder code finis


    }

    // buttton code for go to 2 page
    public void juniorkg() {
        Intent intent = new Intent(this, JuniorKg.class);
        startActivity(intent);
    }


    public void SerniorKg() {
        Intent intent = new Intent(this, SerniorKg.class);
        startActivity(intent);
    }

    public void   FirstStd() {
        Intent intent = new Intent(this, FirstStd.class);
        startActivity(intent);

    }

    public void  SecondStd() {
        Intent intent = new Intent(this,  SecondStd.class);
        startActivity(intent);
    }

// finish button code
    }
