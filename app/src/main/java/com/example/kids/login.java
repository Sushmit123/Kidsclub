package com.example.kids;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.kids.databinding.ActivityLoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    ActivityLoginBinding binding;
    FirebaseAuth auth;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        auth = FirebaseAuth.getInstance();

        dialog = new ProgressDialog(this);
        dialog.setMessage("Login in....");

        binding.loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, pass;
                email = binding.emailBox.getText().toString();
                pass = binding.passwordBox.getText().toString();

                dialog.show();

                auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            dialog.dismiss();
                            startActivity(new Intent(login.this,MainActivity.class ));
                            Toast.makeText(login.this, "Success", Toast.LENGTH_SHORT).show();


                        }else {
                            Toast.makeText(login.this, task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        }


                    }
                });

//                binding.signupbtn.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        startActivity(new Intent(login.this, Register.class));
//                    }
//                });
                binding.signupbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(login.this,Register.class));
                    }
                });
            }
        });
    }
}