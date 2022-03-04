package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Finish extends AppCompatActivity {
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        button1 = findViewById(R.id.button1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { MainActivity();
            }
        });
    }
    public void MainActivity(){
        Intent intent = new Intent(this,  MainActivity.class);
        startActivity(intent);
    }
}
