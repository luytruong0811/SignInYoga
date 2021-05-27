package com.example.signinyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
=======
>>>>>>> 90ba1baee81ff038372148fe3b4acfede61e43d0
import android.widget.LinearLayout;

public class ActivitySignIn extends AppCompatActivity {
    private LinearLayout lnSignInWithEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

<<<<<<< HEAD
        clSignInWithEmail = findViewById(R.id.cl_sign_in_with_email);

        clSignInWithEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySignIn.this, SignInWithEmail.class);
                startActivity(intent);
            }
=======
        lnSignInWithEmail = findViewById(R.id.ln_sign_in_with_email);
        lnSignInWithEmail.setOnClickListener(v -> {
            Intent intent = new Intent(ActivitySignIn.this, SignInWithEmail.class);
            startActivity(intent);
>>>>>>> 90ba1baee81ff038372148fe3b4acfede61e43d0
        });

    }

}