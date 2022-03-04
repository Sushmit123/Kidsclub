package com.example.kids;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.kids.databinding.ActivityRegisterBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class Register extends AppCompatActivity {

    ActivityRegisterBinding binding;
    FirebaseAuth auth;
    FirebaseFirestore database;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        auth = FirebaseAuth.getInstance();
        database = FirebaseFirestore.getInstance();

        dialog = new ProgressDialog(this);
        dialog.setMessage("we are creating new account....");


        binding.RegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, pass, name;

                email = binding.emailBox.getText().toString();
                pass = binding.passwordBox.getText().toString();
                name = binding.name.getText().toString();

                final User user = new User(name, email, pass);

                dialog.show();


                auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            String uid = task.getResult().getUser().getUid();
                            database.collection("users")
                                    .document(uid)
                                    .set(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()){
                                        dialog.dismiss();
                                        startActivity(new Intent(Register.this,MainActivity.class));
                                        finish();
                                    }else {
                                        Toast.makeText(Register.this, task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                            Toast.makeText(Register.this, "Success", Toast.LENGTH_SHORT).show();


                        }else {
                            dialog.dismiss();
                            Toast.makeText(Register.this, task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                binding.Loginbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(Register.this,login.class));
                    }
                });

            }
        });
    }
}