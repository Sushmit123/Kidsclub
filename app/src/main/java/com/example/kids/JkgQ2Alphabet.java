package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class JkgQ2Alphabet extends AppCompatActivity {


    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button nextbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jkg_q2_alphabet);







//    CountDownTimer countDownTimer;
//    int timervalue = 20;
//    ProgressBar progressBar;
//    List<JkgAlphabetModelclass> allQuetionsList;
//    JkgAlphabetModelclass modelclass;
//    int index=0;
//    TextView card_question, optiona, optionb,optionc,optiond;
//    CardView cardOA, cardOB, cardOC, cardoD;


        //button

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        nextbtn = findViewById(R.id.nextbtn);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(JkgQ2Alphabet.this, "Right" , Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    button1.setBackgroundColor(Color.GREEN);
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
                Toast.makeText(JkgQ2Alphabet.this, "Worng" , Toast.LENGTH_SHORT).show();
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
                Toast.makeText(JkgQ2Alphabet.this, "Wrong" , Toast.LENGTH_SHORT).show();
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
                Toast.makeText(JkgQ2Alphabet.this, "Wrong" , Toast.LENGTH_SHORT).show();
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
                JkgQ3Alphabet();
            }
        });







        //button finsih


//       progressBar=findViewById(R.id.quiz_timer);
//        progressBar=findViewById(R.id.quiz_timer);
//        card_question=(TextView) findViewById(R.id.card_question);
//        optiona=(TextView)findViewById(R.id.card_optiona);
//        optionb=(TextView)findViewById(R.id.card_optionb);
//        optionc=(TextView)findViewById(R.id.card_optionc);
//        optiond=(TextView)findViewById(R.id.card_optiond);
//
//        cardOA=(CardView) findViewById(R.id.card_A);
//        cardOB=(CardView)findViewById(R.id.card_B);
//        cardOC=(CardView)findViewById(R.id.card_C);
//        cardoD=(CardView)findViewById(R.id.card_D);


//       allQuetionsList = list;
//       Collections.shuffle(allQuetionsList);
//       modelclass=list.get(index);
//
//       setAllData();
//
//
//
//       countDownTimer=new CountDownTimer(20000, 1000) {
//           @Override
//           public void onTick(long l) {
//               timervalue=timervalue-1;
//               progressBar.setProgress(timervalue);
//
//           }
//
//           @Override
//           public void onFinish() {
//               Dialog dialog=new Dialog(JkgAlphabet.this);
//               dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
//               dialog.setContentView(R.layout.time_out_dialiog);
//
//               dialog.findViewById(R.id.btn_tryagain).setOnClickListener(new View.OnClickListener() {
//                   @Override
//                   public void onClick(View view) {
//                       Intent intent=new Intent(JkgAlphabet.this,JuniorKg.class);
//                       startActivity(intent);
//                   }
//               });
//
//
//               dialog.show();
//
//           }
//       }.start();
//    }
//   private void setAllData(){
//       card_question.setText(modelclass.getQuestion());
//       optiona.setText(modelclass.getoA());
//       optionb.setText(modelclass.getoB());
//       optionc.setText(modelclass.getoC());
//       optiond.setText(modelclass.getoD());
//
//   }
////
////
////
////    private void Hooks(){
////
////    }
    }

    public void  JkgQ3Alphabet() {
        Intent intent = new Intent(this,  JkgQ3Alphabet.class);
        startActivity(intent);
    }
}
