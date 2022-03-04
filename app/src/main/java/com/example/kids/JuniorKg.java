package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class JuniorKg extends AppCompatActivity {

    private String selectedTopicName = "";
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior_kg);


        button1 =(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JkgAlphabet();
            }
        });

        button2 =(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JkgMaths();

            }
        });

        button3 =(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JkgColor();

            }
        });

        button4 =(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JkgVehicle();
            }
        });


        final LinearLayout alphabet = findViewById(R.id.alphabet);
        final LinearLayout number = findViewById(R.id.number);
        final  LinearLayout color = findViewById(R.id.color);
        final LinearLayout vehicle = findViewById(R.id.Vehicles);

//        final Button startBtn = findViewById(R.id.startQuizBtn);

        alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName= "alphabet";
                alphabet.setBackgroundResource(R.drawable.round_back_white_stroke10);

                number.setBackgroundResource(R.drawable.round_back_white10);
                color.setBackgroundResource(R.drawable.round_back_white10);
                vehicle.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "number";

                number.setBackgroundResource(R.drawable.round_back_white_stroke10);

                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                color.setBackgroundResource(R.drawable.round_back_white10);
                vehicle.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "color";

                color.setBackgroundResource(R.drawable.round_back_white_stroke10);

                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                number.setBackgroundResource(R.drawable.round_back_white10);
                vehicle.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Vehicle";

                vehicle.setBackgroundResource(R.drawable.round_back_white_stroke10);

                alphabet.setBackgroundResource(R.drawable.round_back_white10);
                number.setBackgroundResource(R.drawable.round_back_white10);
                color.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

//        startBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (selectedTopicName.isEmpty()){
//                    Toast.makeText(JuniorKg.this, "Please select the topic", Toast.LENGTH_SHORT ).show();
//                }
//                else {
//                    Intent intent = new Intent(JuniorKg.this, JkgdashboardActivity.class);
//                    intent.putExtra("selectedTopic", selectedTopicName);
//                    startActivity(intent);
//                }
//            }
//        });



    }
    public void  JkgAlphabet() {
        Intent intent = new Intent(this,  JkgAlphabet.class);
        startActivity(intent);
    }

    public void JkgMaths() {
        Intent intent = new Intent(this, JkgMaths.class);
        startActivity(intent);
    }
    public void JkgColor(){
        Intent intent = new Intent(this, JkgColor.class);
        startActivity(intent);
    }
    public void JkgVehicle(){
        Intent intent = new Intent(this, JkgVehicle.class);
        startActivity(intent);
    }
}


